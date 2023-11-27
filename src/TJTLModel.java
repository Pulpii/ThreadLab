import java.util.ArrayList;

public class TJTLModel {
    ProductorConsumidorController controller;

    ArrayList<Consumidor> consumidores = new ArrayList<>();
    ArrayList<Productor> productores = new ArrayList<>();

    public TJTLModel(ProductorConsumidorController controller) {
        this.controller = controller;
    }

    public void play(){
        ArrayList<Thread> threads = new ArrayList<>();

        for (Productor p : productores){
            Thread hilo = new Thread(p);
            hilo.start();
            threads.add(hilo);
        }

        for (Consumidor c : consumidores){
            Thread hilo = new Thread(c);
            hilo.start();
            threads.add(hilo);
        }
    }

    public ProductorConsumidorController getController() {
        return controller;
    }

    public void setController(ProductorConsumidorController controller) {
        this.controller = controller;
    }
}