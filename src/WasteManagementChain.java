public class WasteManagementChain implements WasteCollector {
    private WasteCollector firstCollector;

    public WasteManagementChain() {
        this.firstCollector = new OrganicWasteCollector();
        WasteCollector recyclable = new RecyclableWasteCollector();
        WasteCollector hazardous = new HazardousWasteCollector();
        firstCollector.setNextCollector(recyclable);
        recyclable.setNextCollector(hazardous);
    }

    @Override
    public void collect(WasteContainer container) {
        firstCollector.collect(container);
    }

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.firstCollector = nextCollector;
    }
}