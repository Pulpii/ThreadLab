public class ProductorConsumidorController {
    private TJTLModel model;

    private TJTLVista view;

    public ProductorConsumidorController() {
        this.model = new TJTLModel(this);
        //this.view = new TJTLVista(this);
    }

    public static void main(String[] args){
        ProductorConsumidorController controller = new ProductorConsumidorController();

        Thread hilo = new Thread(controller.getView());
        hilo.start();

        //Crear dto default parameters que se le pasará arriba al constructor de vista

        //además de aplicarlos
        //applyConfig(labParameters);

        controller.model.play();
    }

    
    private void applyConfig(LabParameters configuracion){
        for (int i = 0; i < configuracion.getNumConsumers(); i++) {
            Consumidor c = new Consumidor(this.model);
            if (configuracion.isRandomTimeConsumers()){
                c.setTiempoSleepFijo(0);
                c.setTiempoSleepRandom(configuracion.getRandomTimeValueConsumers());
            } else {
                c.setTiempoSleepRandom(0);
                c.setTiempoSleepFijo(configuracion.getStaticTimeValueConsumers());
            }
            model.consumidores.add(c);
        }

        for (int i = 0; i < configuracion.getNumProducers(); i++) {
            Productor p = new Productor(this.model);
            if (configuracion.isRandomTimeProducers()){
                p.setTiempoSleepFijo(0);
                p.setTiempoSleepRandom(configuracion.getRandomTimeValueProducers());
            } else {
                p.setTiempoSleepRandom(0);
                p.setTiempoSleepFijo(configuracion.getStaticTimeValueProducers());
            }
            model.productores.add(p);
        }
    }

    public TJTLModel getModel() {
        return model;
    }

    public void setModel(TJTLModel model) {
        this.model = model;
    }

    public TJTLVista getView() {
        return view;
    }

    public void setView(TJTLVista view) {
        this.view = view;
    }

}