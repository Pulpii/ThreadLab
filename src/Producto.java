public class Producto {
    private int valor;

    public Producto() {
        this.valor = 0;
    }

    public synchronized void producir() {
        this.valor++;
    }

    public synchronized void consumir() {
        this.valor--;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}