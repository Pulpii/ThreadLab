import DTO.LabParameters;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.format.DateTimeFormatter;

public class TJTLVista extends JFrame implements ComponentListener, ActionListener, ItemListener, Runnable {

    private LabParameters newConfig;
    private GeneralConfiguration generalConfiguration;
    private ControlPanel controlPanel;
    private ResultsViewer resultsViewer;

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public TJTLVista(ProductorConsumidorController controller, LabParameters defaultParameters) {
        GridBagConstraints c = new GridBagConstraints();
        //TODO inyectar el atributo de model "defaultParameters" q será un obj de esa clase con los valores pred
        this.newConfig = defaultParameters;
        this.generalConfiguration = new GeneralConfiguration(c);
        this.controlPanel = new ControlPanel(c, this::actionPerformed);
        this.resultsViewer = new ResultsViewer(c);
        this.configureJFrame(c);
        this.setVisible(true);
    }

    private void configureJFrame(GridBagConstraints c){
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 900);
        this.addComponentsToPane(this.getContentPane(), c);
    }

    private void addComponentsToPane(Container panel, GridBagConstraints c){
        ControlPanel controlPanel = new ControlPanel(c, this::actionPerformed);
        GeneralConfiguration generalConfiguration = new GeneralConfiguration(c);
        ResultsViewer resultsViewer = new ResultsViewer(c);

        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.gridheight = 1;
        c.weightx = 0;
        c.weighty = 0;

        panel.setBackground(Color.decode("#ebc278"));
        panel.add(controlPanel, c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;

        panel.add(generalConfiguration, c);

        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;

        panel.add(resultsViewer, c);

    }

    public void run() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        switch (str) {
            case "Apply":
                //setNewConfig(
                     //   new LabParameters(
                     //           Integer.parseInt(getGeneralConfiguration().getConsumers().getText()),
                     //           Integer.parseInt(getGeneralConfiguration().getProductors().getText()),
                     //           getGeneralConfiguration().getRandomProduceTime().isSelected(),
                     //           getGeneralConfiguration().getRandomConsumeTime().isSelected(),
    //         );
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

    public LabParameters getNewConfig() {
        return newConfig;
    }

    public void setNewConfig(LabParameters newConfig) {
        this.newConfig = newConfig;
    }

    public GeneralConfiguration getGeneralConfiguration() {
        return generalConfiguration;
    }

    public void setGeneralConfiguration(GeneralConfiguration generalConfiguration) {
        this.generalConfiguration = generalConfiguration;
    }

    public ControlPanel getControlPanel() {
        return controlPanel;
    }

    public void setControlPanel(ControlPanel controlPanel) {
        this.controlPanel = controlPanel;
    }

    public ResultsViewer getResultsViewer() {
        return resultsViewer;
    }

    public void setResultsViewer(ResultsViewer resultsViewer) {
        this.resultsViewer = resultsViewer;
    }
}