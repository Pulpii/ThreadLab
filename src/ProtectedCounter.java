public class ProtectedCounter {
    private int value;

    public ProtectedCounter() {
        this.value = 0;
    }

    public void inc() {
        this.value++;
        if (LabParameters.preventNegativeStock){
            notifyAll();
        }
    }

    public void dec() {
        if (LabParameters.preventNegativeStock){
            while (this.value < 1){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        this.value--;
    }

    public synchronized void incSyncronized() {
        this.value++;
        if (LabParameters.preventNegativeStock){
            notifyAll();
        }
    }

    public synchronized void decSyncronized() {
        if (LabParameters.preventNegativeStock){
            while (this.value == 0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        this.value--;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
