import javax.swing.*;
import java.awt.*;

public class ParametersPanel extends JPanel {
    private JTextField productors;
    private JTextField numItemsToProduct;
    private JCheckBox randomProduceTime;
    private JSlider randomMaxtimeToProduce;
    private JTextField staticMaxTimeToProduce;
    private JTextField consumer;
    private JTextField numItemsToConsume;
    private JCheckBox randomConsumeTime;
    private JSlider randomMaxtimeToConsume;
    private JTextField staticMaxTimeToConsume;


   public ParametersPanel(GridBagConstraints c) {
       JLabel productorsLabel = new JLabel("Productors");
       productorsLabel.setForeground(Color.white);
       this.productors = new JTextField("0");
       this.productors.setColumns(5);
       JLabel numItemsToProduceLabel = new JLabel("Number to produce per productor");
       numItemsToProduceLabel.setForeground(Color.white);
       this.numItemsToProduct = new JTextField("0");
       JLabel randomTimeToProduceLabel = new JLabel("Random time to produce");
       randomTimeToProduceLabel.setForeground(Color.white);
       this.randomProduceTime = new JCheckBox();
       JLabel timeToProduceLabel = new JLabel("Time to produce");
       timeToProduceLabel.setForeground(Color.white);

       this.randomMaxtimeToProduce = new JSlider(JSlider.HORIZONTAL, 0, 100, 10);
       this.randomMaxtimeToProduce.setMajorTickSpacing(10);
       this.randomMaxtimeToProduce.setMinorTickSpacing(25);
       this.randomMaxtimeToProduce.setPaintTicks(true);
       this.randomMaxtimeToProduce.setPaintLabels(true);
       this.randomMaxtimeToProduce.setVisible(false);

       this.staticMaxTimeToProduce = new JTextField(0);
       this.staticMaxTimeToProduce.setColumns(4);

       JLabel consumersLabel = new JLabel("Consumers");
       consumersLabel.setForeground(Color.white);
       this.consumer = new JTextField("0");
       JLabel numItemsToConsumLabel = new JLabel("Number to consum per consumer");
       numItemsToConsumLabel.setForeground(Color.white);
       this.numItemsToConsume = new JTextField("0");
       JLabel randomTimeToConsumLabel = new JLabel("Random time to consume");
       randomTimeToConsumLabel.setForeground(Color.white);
       this.randomConsumeTime = new JCheckBox();
       JLabel timeToConsumLabel = new JLabel("Time to consume");
       timeToConsumLabel.setForeground(Color.white);

       this.randomMaxtimeToConsume = new JSlider(JSlider.HORIZONTAL, 0, 100, 10);
       this.randomMaxtimeToConsume.setMajorTickSpacing(10);
       this.randomMaxtimeToConsume.setMinorTickSpacing(25);
       this.randomMaxtimeToConsume.setPaintTicks(true);
       this.randomMaxtimeToConsume.setPaintLabels(true);
       this.randomMaxtimeToConsume.setVisible(false);

       this.staticMaxTimeToConsume = new JTextField(0);
       this.staticMaxTimeToConsume.setColumns(4);

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
       this.consumer.setColumns(3);
       this.consumer.setBackground(Color.decode("#292828"));
       this.consumer.setForeground(Color.white);
       this.consumer.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));
       this.add(this.consumer, c);
       c.gridx = 0;
       c.gridy = 2;
       this.add(numItemsToProduceLabel, c);
       c.gridx = 1;
       this.add(numItemsToConsumLabel, c);
       c.gridy = 3;
       c.gridx = 0;
       this.numItemsToProduct.setColumns(3);
       this.numItemsToProduct.setBackground(Color.decode("#292828"));
       this.numItemsToProduct.setForeground(Color.white);
       this.numItemsToProduct.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));
       this.add(this.numItemsToProduct, c);
       c.gridx = 1;
       this.numItemsToConsume.setColumns(3);
       this.numItemsToConsume.setBackground(Color.decode("#292828"));
       this.numItemsToConsume.setForeground(Color.white);
       this.numItemsToConsume.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));
       this.add(this.numItemsToConsume, c);
       c.gridx = 0;
       c.gridy = 4;

       this.add(randomTimeToProduceLabel, c);
       c.gridy = 5;
       this.add(this.randomProduceTime,c);
       c.gridx = 1;
       c.gridy = 4;
       this.add(randomTimeToConsumLabel, c);
       c.gridy = 5;
       this.add(this.randomConsumeTime,c);

       c.gridx = 0;
       c.gridy = 6;
       this.add(timeToProduceLabel, c);
       c.gridy = 7;
       this.add(this.randomMaxtimeToProduce, c);
       this.add(this.staticMaxTimeToProduce, c);
       c.gridx = 1;
       c.gridy = 6;
       this.add(timeToConsumLabel, c);
       c.gridy = 7;
       this.add(this.randomMaxtimeToConsume, c);
       this.add(this.staticMaxTimeToConsume, c);




   }

    public JTextField getProductors() {
        return productors;
    }

    public void setProductors(JTextField productors) {
        this.productors = productors;
    }

    public JTextField getNumItemsToProduct() {
        return numItemsToProduct;
    }

    public void setNumItemsToProduct(JTextField numItemsToProduct) {
        this.numItemsToProduct = numItemsToProduct;
    }

    public JCheckBox getRandomProduceTime() {
        return randomProduceTime;
    }

    public void setRandomProduceTime(JCheckBox randomProduceTime) {
        this.randomProduceTime = randomProduceTime;
    }

    public JSlider getRandomMaxtimeToProduce() {
        return randomMaxtimeToProduce;
    }

    public void setRandomMaxtimeToProduce(JSlider randomMaxtimeToProduce) {
        this.randomMaxtimeToProduce = randomMaxtimeToProduce;
    }

    public JTextField getStaticMaxTimeToProduce() {
        return staticMaxTimeToProduce;
    }

    public void setStaticMaxTimeToProduce(JTextField staticMaxTimeToProduce) {
        this.staticMaxTimeToProduce = staticMaxTimeToProduce;
    }

    public JTextField getConsumer() {
        return consumer;
    }

    public void setConsumer(JTextField consumer) {
        this.consumer = consumer;
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

    public JSlider getRandomMaxtimeToConsume() {
        return randomMaxtimeToConsume;
    }

    public void setRandomMaxtimeToConsume(JSlider randomMaxtimeToConsume) {
        this.randomMaxtimeToConsume = randomMaxtimeToConsume;
    }

    public JTextField getStaticMaxTimeToConsume() {
        return staticMaxTimeToConsume;
    }

    public void setStaticMaxTimeToConsume(JTextField staticMaxTimeToConsume) {
        this.staticMaxTimeToConsume = staticMaxTimeToConsume;
    }
}
