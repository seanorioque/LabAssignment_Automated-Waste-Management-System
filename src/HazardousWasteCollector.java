public class HazardousWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getWasteType().equalsIgnoreCase("hazardous")) {
            System.out.println("HazardousWasteCollector: Collecting hazardous waste. "
                    + "Capacity: " + container.getCapacity() + "%");
            System.out.println("HazardousWasteCollector: Sending to hazardous disposal facility.");
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