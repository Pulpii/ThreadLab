import java.time.LocalTime;
import java.util.Random;

public class Consumidor implements Runnable{
    ProductorConsumidorModel model;
    private int tiempoSleepFijo;
    private int tiempoSleepRandom;
    public Consumidor(ProductorConsumidorModel model) {
        this.model = model;
    }

    public void run() {
        if (this.model.getController().getPrimero().isAfter(LocalTime.now())){
            this.model.getController().setPrimero(LocalTime.now());
        }

        this.model.getController().getConsumidoresIniciados().producir();
        for (int i = 0; i < 100; i++){

            this.model.getController().getContador().consumir();
            try {
                if (tiempoSleepFijo == 0){
                    Random rand = new Random();
                    int sleepTime = rand.nextInt( 1000);
                    Thread.sleep(sleepTime);
                } else {
                    Thread.sleep(tiempoSleepFijo);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.model.getController().getConsumidoresIniciados().consumir();
        this.model.getController().getConsumidoresAcabados().producir();
        notifyAll();
        if (this.model.getController().getUltimo().isBefore(LocalTime.now())){
            this.model.getController().setUltimo(LocalTime.now());
        }
    }

    public int getTiempoSleepFijo() {
        return tiempoSleepFijo;
    }

    public void setTiempoSleepFijo(int tiempoSleep) {
        this.tiempoSleepFijo = tiempoSleep;
    }

    public int getTiempoSleepRandom() {
        return tiempoSleepRandom;
    }

    public void setTiempoSleepRandom(int tiempoSleepRandom) {
        this.tiempoSleepRandom = tiempoSleepRandom;
    }
}