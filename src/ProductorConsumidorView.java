import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.format.DateTimeFormatter;

public class ProductorConsumidorView extends JFrame implements ComponentListener, ActionListener, ItemListener, Runnable {
    private JButton startButton;

    private JTextField contador;

    private JTextField consumidoresIniciados;

    private JTextField consumidoresAcabados;

    private JTextField numConsumidores;

    private JTextField productoresIniciados;

    private JTextField productoresAcabados;

    private JTextField numProductores;
    private JTextField horaInicio;
    private JTextField horaFin;
    private JCheckBox tiempoAleatorioProductor;
    private JSlider sliderProductor;
    private JTextField tiempoSleepProductor;
    private JCheckBox tiempoAleatorioConsumidor;
    private JSlider sliderConsumidor;
    private JTextField tiempoSleepConsumidor;
    private JCheckBox protegerRegionesCriticas;
    private ProductorConsumidorController controller;

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    private void configureJFrame(){
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 700);
        this.addComponentsToPane(this.getContentPane());
    }

    public ProductorConsumidorView(ProductorConsumidorController controller) {
        this.configureJFrame();
        this.setVisible(true);
    }

    private void addComponentsToPane(Container panel){
        GridBagConstraints c = new GridBagConstraints();
        ControlPanel controlPanel = new ControlPanel(c, this::actionPerformed);
        ParametersPanel parametersPanel = new ParametersPanel(c);
        ResultPanel resultPanel = new ResultPanel(c);

        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.gridheight = 1;
        c.weightx = 0;
        c.weighty = 0;

        panel.setBackground(Color.BLACK);
        panel.add(controlPanel, c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;

        panel.add(parametersPanel, c);

        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;

        panel.add(resultPanel, c);

    }

    public void run() {
        while(true){
            try{
                Thread.sleep(100);
                this.getContador().setText(String.valueOf(controller.getContador().getValor()));
                this.consumidoresIniciados.setText(String.valueOf(controller.getConsumidoresIniciados().getValor()));
                this.consumidoresAcabados.setText(String.valueOf(controller.getConsumidoresAcabados().getValor()));
                this.productoresIniciados.setText(String.valueOf(controller.getProductosIniciados().getValor()));
                this.productoresAcabados.setText(String.valueOf(controller.getProductoresAcabados().getValor()));
                this.horaInicio.setText(controller.getPrimero().format(formatter));
                this.horaFin.setText(controller.getUltimo().format(formatter));
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        switch (str) {
            case "Play":
                this.getContador().setText("0");
                this.consumidoresIniciados.setText("0");
                this.consumidoresAcabados.setText("0");
                this.productoresIniciados.setText("0");
                this.productoresAcabados.setText("0");
                this.horaInicio.setText("0");
                this.horaFin.setText("0");
                controller.play();
                break;
            default:
                System.err.println("Acción NO tratada: " + e);
        }
    }

    @Override
    public void componentHidden(ComponentEvent ce) {
        //System.out.println("Frame hidden");
    }


    @Override
    public void componentMoved(ComponentEvent ce) {
        // System.out.println("Frame moved");
    }


    @Override
    public void componentResized(ComponentEvent ce) {
        // System.out.println("Frame resized");
    }


    @Override
    public void componentShown(ComponentEvent ce) {
        // System.out.println("Frame Shown");
    }


    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        int estado = itemEvent.getStateChange();
        if (estado == ItemEvent.SELECTED) {
        } else {
        }
    }

    public JButton getStartButton() {
        return startButton;
    }

    public void setStartButton(JButton startButton) {
        this.startButton = startButton;
    }

    public JTextField getContador() {
        return contador;
    }

    public void setContador(JTextField contador) {
        this.contador = contador;
    }

    public ProductorConsumidorController getController() {
        return controller;
    }

    public void setController(ProductorConsumidorController controller) {
        this.controller = controller;
    }

    public JTextField getNumConsumidores() {
        return numConsumidores;
    }

    public void setNumConsumidores(JTextField numConsumidores) {
        this.numConsumidores = numConsumidores;
    }

    public JTextField getNumProductores() {
        return numProductores;
    }

    public void setNumProductores(JTextField numProductores) {
        this.numProductores = numProductores;
    }

    public JCheckBox getTiempoAleatorioProductor() {
        return tiempoAleatorioProductor;
    }

    public void setTiempoAleatorioProductor(JCheckBox tiempoAleatorioProductor) {
        this.tiempoAleatorioProductor = tiempoAleatorioProductor;
    }

    public JSlider getSliderProductor() {
        return sliderProductor;
    }

    public void setSliderProductor(JSlider sliderProductor) {
        this.sliderProductor = sliderProductor;
    }

    public JTextField getTiempoSleepProductor() {
        return tiempoSleepProductor;
    }

    public void setTiempoSleepProductor(JTextField tiempoSleepProductor) {
        this.tiempoSleepProductor = tiempoSleepProductor;
    }

    public JCheckBox getTiempoAleatorioConsumidor() {
        return tiempoAleatorioConsumidor;
    }

    public void setTiempoAleatorioConsumidor(JCheckBox tiempoAleatorioConsumidor) {
        this.tiempoAleatorioConsumidor = tiempoAleatorioConsumidor;
    }

    public JSlider getSliderConsumidor() {
        return sliderConsumidor;
    }

    public void setSliderConsumidor(JSlider sliderConsumidor) {
        this.sliderConsumidor = sliderConsumidor;
    }

    public JTextField getTiempoSleepConsumidor() {
        return tiempoSleepConsumidor;
    }

    public void setTiempoSleepConsumidor(JTextField tiempoSleepConsumidor) {
        this.tiempoSleepConsumidor = tiempoSleepConsumidor;
    }

    public JCheckBox getProtegerRegionesCriticas() {
        return protegerRegionesCriticas;
    }

    public void setProtegerRegionesCriticas(JCheckBox protegerRegionesCriticas) {
        this.protegerRegionesCriticas = protegerRegionesCriticas;
    }
}