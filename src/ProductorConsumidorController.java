import java.time.LocalTime;

public class ProductorConsumidorController {
    private ProductorConsumidorModel model;

    private ProductorConsumidorView view;

    private Producto producto;

    Producto productoPI;
    Producto productoPA;

    Producto productoCI;
    Producto productoCA;

    LocalTime primero;

    LocalTime ultimo;


    public ProductorConsumidorController() {
        this.producto = new Producto();
        this.productoPI = new Producto();
        this.productoPA = new Producto();
        this.productoCI = new Producto();
        this.productoCA = new Producto();
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
        this.productoPI.setValor(0);
        this.productoPA.setValor(0);
        this.productoCI.setValor(0);
        this.productoCA.setValor(0);
        this.setPrimero(LocalTime.now());
        this.setUltimo(LocalTime.now());

        //TODO DTO JEJE GODDD
        //DTOconfiguracion dtOconfiguracion = new DTOconfiguracion()

        this.model.play();
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

    public Producto getContadorPI() {
        return productoPI;
    }

    public void setContadorPI(Producto productoPI) {
        this.productoPI = productoPI;
    }

    public Producto getContadorPA() {
        return productoPA;
    }

    public void setContadorPA(Producto productoPA) {
        this.productoPA = productoPA;
    }

    public Producto getContadorCI() {
        return productoCI;
    }

    public void setContadorCI(Producto productoCI) {
        this.productoCI = productoCI;
    }

    public Producto getContadorCA() {
        return productoCA;
    }

    public void setContadorCA(Producto productoCA) {
        this.productoCA = productoCA;
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