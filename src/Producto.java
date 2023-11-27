public class Producto {
    private String description;
    private int producedQuantity;

    private int consumedQuantity;

    public Producto() {
        this.consumedQuantity = 0;
        this.producedQuantity = 0;
    }

    public void produce() {
        this.producedQuantity++;
    }

    public void consume() {
        this.consumedQuantity++;
        this.producedQuantity--;
    }

}