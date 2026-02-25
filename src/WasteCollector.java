public interface WasteCollector {
    void setNextCollector(WasteCollector collector);
    void collect(WasteContainer container);
}
