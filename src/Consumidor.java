import java.time.LocalTime;
import java.util.Random;

public class Consumidor implements Runnable{
    TJTLModel model;
    private int tiempoSleepFijo;
    private int tiempoSleepRandom;
    public Consumidor(TJTLModel model) {
        this.model = model;
    }

    public void run() {
        if (this.model.getController().getPrimero().isAfter(LocalTime.now())){
            this.model.getController().setPrimero(LocalTime.now());
        }

        this.model.getController().getConsumidoresIniciados().produce();
        for (int i = 0; i < 100; i++){

            this.model.getController().getContador().consume();
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
        this.model.getController().getConsumidoresIniciados().consume();
        this.model.getController().getConsumidoresAcabados().produce();
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