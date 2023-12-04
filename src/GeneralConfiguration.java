import javax.swing.*;
import java.awt.*;

public class GeneralConfiguration extends JPanel {
    private JTextField productors;
    private JTextField numItemsToProduce;
    private JSlider randomTimeToProduce;
    private JTextField staticTimeToProduce;
    private JCheckBox randomProduceTime;

    private JTextField consumers;
    private JTextField numItemsToConsume;
    private JSlider randomTimeToConsume;
    private JTextField staticTimeToConsume;
    private JCheckBox randomConsumeTime;


   public GeneralConfiguration(GridBagConstraints c) {
       JLabel productorsLabel = new JLabel("Productors");
       productorsLabel.setForeground(Color.white);
       this.productors = new JTextField(LabParameters.numProducers+"");
       this.productors.setColumns(5);

       JLabel numItemsToProduceLabel = new JLabel("Number to produce per productor");
       numItemsToProduceLabel.setForeground(Color.white);
       this.numItemsToProduce = new JTextField(LabParameters.numToProducePerProducer+"");

       this.randomProduceTime = new JCheckBox("Set random time to produce");
       this.randomProduceTime.setSelected(LabParameters.randomTimeProducers);

       JLabel timeToProduceLabel = new JLabel("Time to produce");
       timeToProduceLabel.setForeground(Color.white);
       this.randomTimeToProduce = new JSlider(JSlider.HORIZONTAL, 0, 100, LabParameters.randomTimeValueProducers);
       this.randomTimeToProduce.setMajorTickSpacing(25);
       this.randomTimeToProduce.setMinorTickSpacing(10);
       this.randomTimeToProduce.setPaintTicks(true);
       this.randomTimeToProduce.setPaintLabels(true);
       this.randomTimeToProduce.setVisible(false);

       this.staticTimeToProduce = new JTextField(LabParameters.staticTimeValueProducers+"");
       this.staticTimeToProduce.setColumns(4);

       JLabel consumersLabel = new JLabel("Consumers");
       consumersLabel.setForeground(Color.white);
       this.consumers = new JTextField(LabParameters.numConsumers+"");

       JLabel numItemsToConsumLabel = new JLabel("Number to consum per consumer");
       numItemsToConsumLabel.setForeground(Color.white);
       this.numItemsToConsume = new JTextField(LabParameters.numToConsumePerConsumer);

       this.randomConsumeTime = new JCheckBox("Set random time to consume");
       this.randomConsumeTime.setSelected(LabParameters.randomTimeConsumers);

       JLabel timeToConsumLabel = new JLabel("Time to consume");
       timeToConsumLabel.setForeground(Color.white);
       this.randomTimeToConsume = new JSlider(JSlider.HORIZONTAL, 0, 100, LabParameters.randomTimeValueConsumers);
       this.randomTimeToConsume.setMajorTickSpacing(25);
       this.randomTimeToConsume.setMinorTickSpacing(10);
       this.randomTimeToConsume.setPaintTicks(true);
       this.randomTimeToConsume.setPaintLabels(true);
       this.randomTimeToConsume.setVisible(false);

       this.staticTimeToConsume = new JTextField(LabParameters.staticTimeValueConsumers+"");
       this.staticTimeToConsume.setColumns(4);

       this.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 2));
       this.setBackground(Color.decode("#292828"));
       this.setLayout(new GridBagLayout());

       c.gridx = 0;
       c.gridy = 0;
       c.weightx = 0;
       c.weighty = 0;
       c.gridheight = 1;
       c.gridwidth = 1;

       this.add(productorsLabel, c);
       c.gridx = 1;
       this.add(consumersLabel, c);
       c.gridx = 0;
       c.gridy = 1;
       this.productors.setColumns(3);
       this.productors.setBackground(Color.decode("#292828"));
       this.productors.setForeground(Color.white);
       this.productors.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));
       this.add(this.productors, c);
       c.gridx = 1;
       this.consumers.setColumns(3);
       this.consumers.setBackground(Color.decode("#292828"));
       this.consumers.setForeground(Color.white);
       this.consumers.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));
       this.add(this.consumers, c);
       c.gridx = 0;
       c.gridy = 2;
       this.add(numItemsToProduceLabel, c);
       c.gridx = 1;
       this.add(numItemsToConsumLabel, c);
       c.gridy = 3;
       c.gridx = 0;
       this.numItemsToProduce.setColumns(3);
       this.numItemsToProduce.setBackground(Color.decode("#292828"));
       this.numItemsToProduce.setForeground(Color.white);
       this.numItemsToProduce.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));
       this.add(this.numItemsToProduce, c);
       c.gridx = 1;
       this.numItemsToConsume.setColumns(3);
       this.numItemsToConsume.setBackground(Color.decode("#292828"));
       this.numItemsToConsume.setForeground(Color.white);
       this.numItemsToConsume.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));
       this.add(this.numItemsToConsume, c);
       c.gridx = 0;

       c.gridy = 5;
       this.add(this.randomProduceTime,c);
       c.gridx = 1;
       this.add(this.randomConsumeTime,c);

       c.gridx = 0;
       c.gridy = 6;
       this.add(timeToProduceLabel, c);
       c.gridy = 7;
       this.add(this.randomTimeToProduce, c);
       this.add(this.staticTimeToProduce, c);
       c.gridx = 1;
       c.gridy = 6;
       this.add(timeToConsumLabel, c);
       c.gridy = 7;
       this.add(this.randomTimeToConsume, c);
       this.add(this.staticTimeToConsume, c);
   }

    public void resetPanelData(){
        this.consumers.setText(LabParameters.numConsumers+"");
        this.numItemsToConsume.setText(LabParameters.numToConsumePerConsumer+"");
        this.randomTimeToConsume.setValue(LabParameters.randomTimeValueConsumers);
        this.staticTimeToConsume.setText(LabParameters.staticTimeValueConsumers+"");
        this.randomConsumeTime.setSelected(LabParameters.randomTimeConsumers);

        this.productors.setText(LabParameters.numProducers+"");
        this.numItemsToProduce.setText(LabParameters.numToProducePerProducer+"");
        this.randomTimeToProduce.setValue(LabParameters.randomTimeValueProducers);
        this.staticTimeToProduce.setText(LabParameters.staticTimeValueProducers+"");
        this.randomProduceTime.setSelected(LabParameters.randomTimeProducers);
    }

    public void applyPanelData(){
        LabParameters.numProducers = Integer.parseInt(this.productors.getText());
        LabParameters.numToProducePerProducer = Integer.parseInt(this.numItemsToProduce.getText());
        LabParameters.randomTimeValueProducers = this.randomTimeToProduce.getValue();
        LabParameters.staticTimeValueProducers = Integer.parseInt(this.staticTimeToProduce.getText());
        LabParameters.randomTimeProducers = this.randomProduceTime.isSelected();

        LabParameters.numConsumers = Integer.parseInt(this.consumers.getText());
        LabParameters.numToConsumePerConsumer = Integer.parseInt(this.numItemsToConsume.getText());
        LabParameters.randomTimeValueConsumers = this.randomTimeToConsume.getValue();
        LabParameters.staticTimeValueConsumers = Integer.parseInt(this.staticTimeToConsume.getText());
        LabParameters.randomTimeConsumers = this.randomConsumeTime.isSelected();
    }

    public JTextField getProductors() {
        return productors;
    }

    public void setProductors(JTextField productors) {
        this.productors = productors;
    }

    public JTextField getNumItemsToProduce() {
        return numItemsToProduce;
    }

    public void setNumItemsToProduce(JTextField numItemsToProduce) {
        this.numItemsToProduce = numItemsToProduce;
    }

    public JCheckBox getRandomProduceTime() {
        return randomProduceTime;
    }

    public void setRandomProduceTime(JCheckBox randomProduceTime) {
        this.randomProduceTime = randomProduceTime;
    }

    public JSlider getRandomTimeToProduce() {
        return randomTimeToProduce;
    }

    public void setRandomTimeToProduce(JSlider randomTimeToProduce) {
        this.randomTimeToProduce = randomTimeToProduce;
    }

    public JTextField getStaticTimeToProduce() {
        return staticTimeToProduce;
    }

    public void setStaticTimeToProduce(JTextField staticTimeToProduce) {
        this.staticTimeToProduce = staticTimeToProduce;
    }

    public JTextField getConsumers() {
        return consumers;
    }

    public void setConsumers(JTextField consumers) {
        this.consumers = consumers;
    }

    public JTextField getNumItemsToConsume() {
        return numItemsToConsume;
    }

    public void setNumItemsToConsume(JTextField numItemsToConsume) {
        this.numItemsToConsume = numItemsToConsume;
    }

    public JCheckBox getRandomConsumeTime() {
        return randomConsumeTime;
    }

    public void setRandomConsumeTime(JCheckBox randomConsumeTime) {
        this.randomConsumeTime = randomConsumeTime;
    }

    public JSlider getRandomTimeToConsume() {
        return randomTimeToConsume;
    }

    public void setRandomTimeToConsume(JSlider randomTimeToConsume) {
        this.randomTimeToConsume = randomTimeToConsume;
    }

    public JTextField getStaticTimeToConsume() {
        return staticTimeToConsume;
    }

    public void setStaticTimeToConsume(JTextField staticTimeToConsume) {
        this.staticTimeToConsume = staticTimeToConsume;
    }
}
