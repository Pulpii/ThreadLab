import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.format.DateTimeFormatter;

public class ProductorConsumidorView extends JFrame implements ComponentListener, ActionListener, ItemListener, Runnable {
    private JButton startButton;

    private JTextField textField;

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
    private ProductorConsumidorController controller;

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");


    public ProductorConsumidorView(ProductorConsumidorController controller) {
        this.controller = controller;

        this.startButton = new JButton("Play");
        this.startButton.addActionListener(this);

        this.textField = new JTextField("0");
        this.textField.setBackground(Color.RED);
        this.textField.setForeground(Color.WHITE);
        this.textField.setFont(new Font("Arial", Font.BOLD, 30));
        this.textField.setHorizontalAlignment(JTextField.CENTER);

        this.consumidoresIniciados = new JTextField("0");
        this.consumidoresAcabados = new JTextField("0");
        this.numConsumidores = new JTextField("0");
        this.productoresIniciados = new JTextField("0");
        this.productoresAcabados = new JTextField("0");
        this.numProductores = new JTextField("0");
        this.horaInicio = new JTextField("0");
        this.horaFin = new JTextField("0");

        this.tiempoAleatorioProductor = new JCheckBox("Tiempo productores aleatorio");
        this.tiempoAleatorioProductor.setSelected(false);
        this.sliderProductor = new JSlider(JSlider.HORIZONTAL, 0, 0, 1000);
        this.sliderProductor.setMajorTickSpacing(50);
        this.sliderProductor.setMinorTickSpacing(25);
        this.sliderProductor.setPaintTicks(true);
        this.sliderProductor.setPaintLabels(true);
        this.tiempoSleepProductor = new JTextField("0");

        this.tiempoAleatorioConsumidor = new JCheckBox("Tiempo consumidores aleatorio");
        this.tiempoAleatorioConsumidor.setSelected(false);
        this.sliderConsumidor = new JSlider(JSlider.HORIZONTAL, 0, 0, 1000);
        this.sliderConsumidor.setMajorTickSpacing(50);
        this.sliderConsumidor.setMinorTickSpacing(25);
        this.sliderConsumidor.setPaintTicks(true);
        this.sliderConsumidor.setPaintLabels(true);
        this.tiempoSleepConsumidor = new JTextField("0");


        this.configureJFrame();

        this.setVisible(true);
    }

    private void addComponentsToPane(Container panel){
        GridBagConstraints c = new GridBagConstraints();

        JLabel labelCI = new JLabel("Consumidores iniciados: ");

        JLabel labelCA = new JLabel("Consumidores acabados: ");

        JLabel labelPI = new JLabel("Productores iniciados: ");

        JLabel labelPA = new JLabel("Productores acabados");

        JLabel horaInicio = new JLabel("Inicio: ");

        JLabel horaFinal = new JLabel("Fin: ");

        JLabel sliderProductorLabel = new JLabel("Tiempo del sleep Productores: ");

        JLabel sliderConsumidorLabel = new JLabel("Tiempo del sleep Consumidor: ");

        c.anchor = GridBagConstraints.NORTHWEST;
        c.fill = GridBagConstraints.NONE;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.insets = new Insets(5, 5, 5, 5);


        panel.add(this.startButton, c);

        c.gridy++;
        c.fill = GridBagConstraints.BOTH;
        c.gridheight = 2;
        c.gridwidth = 2;
        panel.add(this.textField, c);

        c.gridheight = 1;
        c.gridy = c.gridy + 2;
        c.gridx=0;
        panel.add(labelCI, c);
        c.gridx++;
        panel.add(this.consumidoresIniciados, c);

        c.gridy++;
        c.gridx=0;
        panel.add(labelCA, c);
        c.gridx++;
        panel.add(this.consumidoresAcabados, c);

        c.gridy++;
        c.gridx=0;
        panel.add(labelPI, c);
        c.gridx++;
        panel.add(this.productoresIniciados, c);

        c.gridy++;
        c.gridx=0;
        panel.add(labelPA, c);
        c.gridx++;
        panel.add(this.productoresAcabados, c);

        c.gridy++;
        c.gridx=0;
        panel.add(horaInicio, c);
        c.gridx++;
        panel.add(this.horaInicio, c);

        c.gridy++;
        c.gridx=0;
        panel.add(horaFinal, c);
        c.gridx++;
        panel.add(this.horaFin, c);

        c.gridy++;
        c.gridx=0;
        panel.add(sliderProductorLabel, c);
        c.gridy++;
        c.gridx=0;
        panel.add(this.sliderProductor, c);

        c.gridy++;
        c.gridx=0;
        panel.add(sliderConsumidorLabel, c);
        c.gridy++;
        c.gridx=0;
        panel.add(this.sliderConsumidor, c);
    }

    private void configureJFrame(){
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.addComponentsToPane(this.getContentPane());
    }

    public void run() {
        while(true){
            try{
                Thread.sleep(100);
                this.getTextField().setText(String.valueOf(controller.getContador().getValor()));
                this.consumidoresIniciados.setText(String.valueOf(controller.getContadorCI().getValor()));
                this.consumidoresAcabados.setText(String.valueOf(controller.getContadorCA().getValor()));
                this.productoresIniciados.setText(String.valueOf(controller.getContadorPI().getValor()));
                this.productoresAcabados.setText(String.valueOf(controller.getContadorPA().getValor()));
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
                this.getTextField().setText("0");
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

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
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
}