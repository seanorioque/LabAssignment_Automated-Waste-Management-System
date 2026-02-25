public class OrganicWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;


    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collect(WasteContainer container) {
        if(container.getWasteType().equalsIgnoreCase("organic")) {
            System.out.println("OrganiceWasteCollector: Collecting organic waste." + "Capacity: " +
                    container.getCapacity() + "%");
            System.out.println("OrganicWasteCollector: Sendng to composing facility.");
        }else{
            if(nextCollector != null){
                nextCollector.collect(container);
            }else{
                System.out.println("No suitable collector found for waste type:" +
                        container.getWasteType());
            }
        }

    }
}
