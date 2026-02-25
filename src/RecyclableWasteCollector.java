public class RecyclableWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getWasteType().equalsIgnoreCase("recyclable")) {
            System.out.println("RecyclableWasteCollector: Collecting recyclable waste. "
                    + "Capacity: " + container.getCapacity() + "%");
            System.out.println("RecyclableWasteCollector: Sending to recycling center.");
        } else {
            if (nextCollector != null) {
                nextCollector.collect(container);
            } else {
                System.out.println("No suitable collector found for waste type: "
                        + container.getWasteType());
            }
        }
    }
}