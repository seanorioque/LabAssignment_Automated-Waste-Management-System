public class WasteContainer {
    private String wasteType;
    private int capacity;

    public WasteContainer(String wasteType, int capacity) {
        this.wasteType = wasteType;
        this.capacity = capacity;
    }
    public String getWasteType() {
        return wasteType;
    }
    public int getCapacity() {
        return capacity;
    }
}
