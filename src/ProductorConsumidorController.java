import java.time.LocalTime;

public class ProductorConsumidorController {
    private ProductorConsumidorModel model;

    private ProductorConsumidorView view;

    private Producto producto;

    Producto productoresIniciados;
    Producto productoresAcabados;

    Producto consumidoresIniciados;
    Producto consumidoresAcabados;

    LocalTime primero;

    LocalTime ultimo;


    public ProductorConsumidorController() {
        this.producto = new Producto();
        this.productoresIniciados = new Producto();
        this.productoresAcabados = new Producto();
        this.consumidoresIniciados = new Producto();
        this.consumidoresAcabados = new Producto();
        this.primero = LocalTime.now();
        this.ultimo = LocalTime.now();

        this.model = new ProductorConsumidorModel(this);
        this.view = new ProductorConsumidorView(this);
    }

    public static void main(String[] args){
        ProductorConsumidorController controller = new ProductorConsumidorController();

        Thread hilo = new Thread(controller.getView());
        hilo.start();
    }

    public void play(){
        this.producto.setValor(0);
        this.productoresIniciados.setValor(0);
        this.productoresAcabados.setValor(0);
        this.consumidoresIniciados.setValor(0);
        this.consumidoresAcabados.setValor(0);
        this.setPrimero(LocalTime.now());
        this.setUltimo(LocalTime.now());

        DTOconfiguracion dtOconfiguracion = new DTOconfiguracion(
                Integer.parseInt(view.getNumConsumidores().getText()),
                Integer.parseInt(view.getNumProductores().getText()),
                view.getTiempoAleatorioProductor().isSelected(),
                view.getTiempoAleatorioConsumidor().isSelected(),
                view.getSliderConsumidor().getValue(),
                view.getSliderProductor().getValue(),
                view.getProtegerRegionesCriticas().isSelected(),
                Integer.parseInt(view.getTiempoSleepConsumidor().getText()),
                Integer.parseInt(view.getTiempoSleepProductor().getText()));
        
        loadConfigurationToModel(dtOconfiguracion);
        
        this.model.play();
    }
    
    private void loadConfigurationToModel(DTOconfiguracion configuracion){
        for (int i = 0; i < configuracion.getNumConsumidores(); i++) {
            Consumidor c = new Consumidor(this.model);
            if (configuracion.isConsumidoresAleatorios()){
                c.setTiempoSleepFijo(0);
                c.setTiempoSleepRandom(configuracion.getValorSliderConsumidores());
            } else {
                c.setTiempoSleepRandom(0);
                c.setTiempoSleepFijo(configuracion.getValorFijoSleepConsumidores());
            }
            model.consumidores.add(c);
        }

        for (int i = 0; i < configuracion.getNumProductores(); i++) {
            Productor p = new Productor(this.model);
            if (configuracion.isProductoresAleatorios()){
                p.setTiempoSleepFijo(0);
                p.setTiempoSleepRandom(configuracion.getValorSliderProductores());
            } else {
                p.setTiempoSleepRandom(0);
                p.setTiempoSleepFijo(configuracion.getValorFijoSleepProductores());
            }
            model.productores.add(p);
        }
    }

    public ProductorConsumidorModel getModel() {
        return model;
    }

    public void setModel(ProductorConsumidorModel model) {
        this.model = model;
    }

    public ProductorConsumidorView getView() {
        return view;
    }

    public void setView(ProductorConsumidorView view) {
        this.view = view;
    }

    public Producto getContador() {
        return producto;
    }

    public void setContador(Producto producto) {
        this.producto = producto;
    }

    public Producto getProductosIniciados() {
        return productoresIniciados;
    }

    public void setProductoresIniciados(Producto productoPI) {
        this.productoresIniciados = productoPI;
    }

    public Producto getProductoresAcabados() {
        return productoresAcabados;
    }

    public void setProductoresAcabados(Producto productoPA) {
        this.productoresAcabados = productoPA;
    }

    public Producto getConsumidoresIniciados() {
        return consumidoresIniciados;
    }

    public void setConsumidoresIniciados(Producto productoCI) {
        this.consumidoresIniciados = productoCI;
    }

    public Producto getConsumidoresAcabados() {
        return consumidoresAcabados;
    }

    public void setConsumidoresAcabados(Producto productoCA) {
        this.consumidoresAcabados = productoCA;
    }

    public LocalTime getPrimero() {
        return primero;
    }

    public void setPrimero(LocalTime primero) {
        this.primero = primero;
    }

    public LocalTime getUltimo() {
        return ultimo;
    }

    public void setUltimo(LocalTime ultimo) {
        this.ultimo = ultimo;
    }

}