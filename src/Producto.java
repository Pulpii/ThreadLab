public class Producto extends ProtectedCounter{
    private String description;
    private int producedQuantity;
    private int consumedQuantity;

    public Producto(String description) {
        super();
        this.description = description;
        this.consumedQuantity = 0;
        this.producedQuantity = 0;
    }

    public void produce() {
        this.producedQuantity++;
        inc();
    }

    public synchronized void produceSyncronized() {
        this.producedQuantity++;
        incSyncronized();
    }

    public void consume() {
        this.consumedQuantity++;
        dec();
    }

    public synchronized void consumeSyncronized(){
        this.consumedQuantity++;
        decSyncronized();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProducedQuantity() {
        return producedQuantity;
    }

    public void setProducedQuantity(int producedQuantity) {
        this.producedQuantity = producedQuantity;
    }

    public int getConsumedQuantity() {
        return consumedQuantity;
    }

    public void setConsumedQuantity(int consumedQuantity) {
        this.consumedQuantity = consumedQuantity;
    }
}