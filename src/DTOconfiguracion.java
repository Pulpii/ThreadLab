public class DTOconfiguracion {
    private int numProductores;
    private int numConsumidores;
    private boolean productoresAleatorios;
    private boolean consumidoresAleatorios;
    private int valorFijoSleepProductores;
    private int valorFijoSleepConsumidores;
    private int valorSliderProductores;
    private int valorSliderConsumidores;
    private boolean protegerRegionesCriticas;

    public DTOconfiguracion (int numConsumidores, int numProductores, boolean productoresAleatorios, boolean consumidoresAleatorios, int valorSliderConsumidores, int valorSliderProductores, boolean protegerRegionesCriticas, int valorFijoSleepConsumidores, int valorFijoSleepProductores){
        this.productoresAleatorios = productoresAleatorios;
        this.consumidoresAleatorios = consumidoresAleatorios;
        this.valorSliderProductores = valorSliderProductores;
        this.valorSliderConsumidores = valorSliderConsumidores;
        this.valorFijoSleepProductores = valorFijoSleepProductores;
        this.valorFijoSleepConsumidores = valorFijoSleepConsumidores;
        this.protegerRegionesCriticas = protegerRegionesCriticas;
        this.numConsumidores = numConsumidores;
        this.numProductores = numProductores;
    }

    public boolean isProductoresAleatorios() {
        return productoresAleatorios;
    }

    public void setProductoresAleatorios(boolean productoresAleatorios) {
        this.productoresAleatorios = productoresAleatorios;
    }

    public boolean isConsumidoresAleatorios() {
        return consumidoresAleatorios;
    }

    public void setConsumidoresAleatorios(boolean consumidoresAleatorios) {
        this.consumidoresAleatorios = consumidoresAleatorios;
    }

    public int getValorSliderProductores() {
        return valorSliderProductores;
    }

    public void setValorSliderProductores(int valorSliderProductores) {
        this.valorSliderProductores = valorSliderProductores;
    }

    public int getValorSliderConsumidores() {
        return valorSliderConsumidores;
    }

    public void setValorSliderConsumidores(int valorSliderConsumidores) {
        this.valorSliderConsumidores = valorSliderConsumidores;
    }

    public boolean isProtegerRegionesCriticas() {
        return protegerRegionesCriticas;
    }

    public void setProtegerRegionesCriticas(boolean protegerRegionesCriticas) {
        this.protegerRegionesCriticas = protegerRegionesCriticas;
    }

    public int getValorFijoSleepProductores() {
        return valorFijoSleepProductores;
    }

    public void setValorFijoSleepProductores(int valorFijoSleepProductores) {
        this.valorFijoSleepProductores = valorFijoSleepProductores;
    }

    public int getValorFijoSleepConsumidores() {
        return valorFijoSleepConsumidores;
    }

    public void setValorFijoSleepConsumidores(int valorFijoSleepConsumidores) {
        this.valorFijoSleepConsumidores = valorFijoSleepConsumidores;
    }

    public int getNumProductores() {
        return numProductores;
    }

    public void setNumProductores(int numProductores) {
        this.numProductores = numProductores;
    }

    public int getNumConsumidores() {
        return numConsumidores;
    }

    public void setNumConsumidores(int numConsumidores) {
        this.numConsumidores = numConsumidores;
    }
}
