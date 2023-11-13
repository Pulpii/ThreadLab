public class DTOconfiguracion {
    private boolean productoresAleatorios;
    private boolean consumidoresAleatorios;
    private int valorFijoSleepProductores;
    private int valorFijoSleepConsumidores;
    private int valorSliderProductores;
    private int valorSliderConsumidores;
    private boolean protegerRegionesCríticas;

    public DTOconfiguracion (boolean productoresAleatorios, boolean consumidoresAleatorios, int valorSliderConsumidores, int valorSliderProductores, boolean protegerRegionesCríticas){
        this.productoresAleatorios = productoresAleatorios;
        this.consumidoresAleatorios = consumidoresAleatorios;
        this.valorSliderProductores = valorSliderProductores;
        this.valorSliderConsumidores = valorSliderConsumidores;
        this.protegerRegionesCríticas = protegerRegionesCríticas;
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

    public boolean isProtegerRegionesCríticas() {
        return protegerRegionesCríticas;
    }

    public void setProtegerRegionesCríticas(boolean protegerRegionesCríticas) {
        this.protegerRegionesCríticas = protegerRegionesCríticas;
    }
}
