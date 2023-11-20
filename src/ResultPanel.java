import javax.swing.*;
import java.awt.*;

public class ResultPanel extends JPanel {
    private JTextField millisecondsToCreateThreadObjects;
    private JTextField millisecondsToStartThreads;
    private JTextField millisecondsToProcessConsumers;
    private JTextField millisecondsToProcessProductors;
    private JTextField amountProducedItems;
    private JTextField amountConsumedItems;
    private JTextField amountThreadsProductorsProcessing;
    private JTextField amountThreadsProductorsEnded;
    private JTextField amountThreadsProductorsPending;
    private JTextField amountThreadsConsumersProcessing;
    private JTextField amountThreadsConsumersEnded;
    private JTextField amountThreadsConsumersPending;

    public ResultPanel(GridBagConstraints c){
        JLabel timeToCreateAllThreadsLabel = new JLabel("Time to create all Threads");
        timeToCreateAllThreadsLabel.setForeground(Color.WHITE);
        this.millisecondsToCreateThreadObjects = new JTextField("0");
        this.millisecondsToCreateThreadObjects.setColumns(4);
        this.millisecondsToCreateThreadObjects.setBackground(Color.decode("#292828"));
        this.millisecondsToCreateThreadObjects.setForeground(Color.white);
        this.millisecondsToCreateThreadObjects.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));

        JLabel timeToStartAllThreadsLabel = new JLabel("Time to start all Threads");
        timeToStartAllThreadsLabel.setForeground(Color.WHITE);
        this.millisecondsToStartThreads = new JTextField("0");
        this.millisecondsToStartThreads.setColumns(4);
        this.millisecondsToStartThreads.setBackground(Color.decode("#292828"));
        this.millisecondsToStartThreads.setForeground(Color.white);
        this.millisecondsToStartThreads.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));

        JLabel timeToProcessConsumersLabel = new JLabel("Time to process consumers");
        timeToProcessConsumersLabel.setForeground(Color.white);
        this.millisecondsToProcessConsumers = new JTextField("0");
        this.millisecondsToProcessConsumers.setColumns(4);
        this.millisecondsToProcessConsumers.setBackground(Color.decode("#292828"));
        this.millisecondsToProcessConsumers.setForeground(Color.white);
        this.millisecondsToProcessConsumers.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));

        JLabel timeToProcessProductorsLabel = new JLabel("Time to process productors");
        timeToProcessProductorsLabel.setForeground(Color.white);
        this.millisecondsToProcessProductors = new JTextField("0");
        this.millisecondsToProcessProductors.setColumns(4);
        this.millisecondsToProcessProductors.setBackground(Color.decode("#292828"));
        this.millisecondsToProcessProductors.setForeground(Color.white);
        this.millisecondsToProcessProductors.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));

        JLabel amountProducedItemsLabel = new JLabel("Produced items");
        amountProducedItemsLabel.setForeground(Color.white);
        this.amountProducedItems = new JTextField("");
        this.amountProducedItems.setColumns(4);
        this.amountProducedItems.setBackground(Color.decode("#292828"));
        this.amountProducedItems.setForeground(Color.white);
        this.amountProducedItems.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));

        JLabel amountConsumedItemsLabel = new JLabel("Consumed items");
        amountConsumedItemsLabel.setForeground(Color.white);
        this.amountConsumedItems = new JTextField("");
        this.amountConsumedItems.setColumns(4);
        this.amountConsumedItems.setBackground(Color.decode("#292828"));
        this.amountConsumedItems.setForeground(Color.white);
        this.amountConsumedItems.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));

        JLabel amountThreadsProductorsProcessingLabel = new JLabel("Amount productors threads processing");
        amountThreadsProductorsProcessingLabel.setForeground(Color.white);
        this.amountThreadsProductorsProcessing = new JTextField("0");
        this.amountThreadsProductorsProcessing.setColumns(4);
        this.amountThreadsProductorsProcessing.setBackground(Color.decode("#292828"));
        this.amountThreadsProductorsProcessing.setForeground(Color.white);
        this.amountThreadsProductorsProcessing.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));

        JLabel amountThreadsProductorsEndedLabel = new JLabel("Amount productors threads ended");
        this.amountThreadsProductorsEnded = new JTextField("0");
        this.amountThreadsProductorsEnded.setColumns(4);
        this.amountThreadsProductorsEnded.setBackground(Color.decode("#292828"));
        this.amountThreadsProductorsEnded.setForeground(Color.white);
        this.amountThreadsProductorsEnded.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));
        amountThreadsProductorsEndedLabel.setForeground(Color.white);

        JLabel amountThreadsProductorsPendingLabel = new JLabel("Amount productors threads pending");
        amountThreadsProductorsPendingLabel.setForeground(Color.white);
        this.amountThreadsProductorsPending = new JTextField("0");
        this.amountThreadsProductorsPending.setColumns(4);
        this.amountThreadsProductorsPending.setBackground(Color.decode("#292828"));
        this.amountThreadsProductorsPending.setForeground(Color.white);
        this.amountThreadsProductorsPending.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));

        JLabel amountThreadsConsumersProcessingLabel = new JLabel("Amount consumer threads processing");
        amountThreadsConsumersProcessingLabel.setForeground(Color.white);
        this.amountThreadsConsumersProcessing = new JTextField("0");
        this.amountThreadsConsumersProcessing.setColumns(4);
        this.amountThreadsConsumersProcessing.setBackground(Color.decode("#292828"));
        this.amountThreadsConsumersProcessing.setForeground(Color.white);
        this.amountThreadsConsumersProcessing.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));

        JLabel amountThreadsConsumersEndedLabel = new JLabel("Amount consumer threads ended");
        amountThreadsConsumersEndedLabel.setForeground(Color.white);
        this.amountThreadsConsumersEnded = new JTextField("0");
        this.amountThreadsConsumersEnded.setColumns(4);
        this.amountThreadsConsumersEnded.setBackground(Color.decode("#292828"));
        this.amountThreadsConsumersEnded.setForeground(Color.white);
        this.amountThreadsConsumersEnded.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));

        JLabel amountThreadsConsumersPendingLabel = new JLabel("Amount consumer threads pending");
        amountThreadsConsumersPendingLabel.setForeground(Color.white);
        this.amountThreadsConsumersPending = new JTextField("0");
        this.amountThreadsConsumersPending.setColumns(4);
        this.amountThreadsConsumersPending.setBackground(Color.decode("#292828"));
        this.amountThreadsConsumersPending.setForeground(Color.white);
        this.amountThreadsConsumersPending.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 1));

        this.setBorder(BorderFactory.createLineBorder(Color.decode("#de6f1f"), 2));
        this.setBackground(Color.decode("#292828"));
        this.setLayout(new GridBagLayout());

        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0;
        c.weighty = 0;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.insets = new Insets(10,3,10,3);

        this.add(timeToCreateAllThreadsLabel, c);
        c.gridx = 1;
        this.add(millisecondsToCreateThreadObjects, c);

        c.gridx = 0;
        c.gridy = 1;
        this.add(timeToStartAllThreadsLabel, c);
        c.gridx = 1;
        this.add(millisecondsToStartThreads, c);

        c.gridy = 2;
        c.gridx = 0;
        this.add(timeToProcessProductorsLabel, c);
        c.gridx = 1;
        this.add(millisecondsToProcessProductors, c);

        c.gridy = 3;
        c.gridx = 0;
        this.add(timeToProcessConsumersLabel, c);
        c.gridx = 1;
        this.add(millisecondsToProcessConsumers, c);

        c.gridy = 4;
        c.gridx = 0;
        this.add(amountConsumedItemsLabel, c);
        c.gridx = 1;
        this.add(amountConsumedItems, c);

        c.gridy = 5;
        c.gridx = 0;
        this.add(amountProducedItemsLabel, c);
        c.gridx = 1;
        this.add(amountProducedItems, c);

        c.gridy = 6;
        c.gridx = 0;
        this.add(amountThreadsProductorsProcessingLabel, c);
        c.gridx = 1;
        this.add(amountThreadsProductorsProcessing, c);

        c.gridy = 7;
        c.gridx = 0;
        this.add(amountThreadsProductorsEndedLabel, c);
        c.gridx = 1;
        this.add(amountThreadsProductorsEnded, c);

        c.gridy = 8;
        c.gridx = 0;
        this.add(amountThreadsProductorsPendingLabel, c);
        c.gridx = 1;
        this.add(amountThreadsProductorsPending, c);

        c.gridy = 9;
        c.gridx = 0;
        this.add(amountThreadsConsumersProcessingLabel, c);
        c.gridx = 1;
        this.add(amountThreadsConsumersProcessing, c);

        c.gridy = 10;
        c.gridx = 0;
        this.add(amountThreadsConsumersEndedLabel, c);
        c.gridx = 1;
        this.add(amountThreadsConsumersEnded, c);

        c.gridy = 11;
        c.gridx = 0;
        this.add(amountThreadsConsumersPendingLabel, c);
        c.gridx = 1;
        this.add(amountThreadsConsumersEnded, c);
    }

    public JTextField getMillisecondsToCreateThreadObjects() {
        return millisecondsToCreateThreadObjects;
    }

    public void setMillisecondsToCreateThreadObjects(JTextField millisecondsToCreateThreadObjects) {
        this.millisecondsToCreateThreadObjects = millisecondsToCreateThreadObjects;
    }

    public JTextField getMillisecondsToStartThreads() {
        return millisecondsToStartThreads;
    }

    public void setMillisecondsToStartThreads(JTextField millisecondsToStartThreads) {
        this.millisecondsToStartThreads = millisecondsToStartThreads;
    }

    public JTextField getMillisecondsToProcessConsumers() {
        return millisecondsToProcessConsumers;
    }

    public void setMillisecondsToProcessConsumers(JTextField millisecondsToProcessConsumers) {
        this.millisecondsToProcessConsumers = millisecondsToProcessConsumers;
    }

    public JTextField getMillisecondsToProcessProductors() {
        return millisecondsToProcessProductors;
    }

    public void setMillisecondsToProcessProductors(JTextField millisecondsToProcessProductors) {
        this.millisecondsToProcessProductors = millisecondsToProcessProductors;
    }

    public JTextField getAmountProducedItems() {
        return amountProducedItems;
    }

    public void setAmountProducedItems(JTextField amountProducedItems) {
        this.amountProducedItems = amountProducedItems;
    }

    public JTextField getAmountConsumedItems() {
        return amountConsumedItems;
    }

    public void setAmountConsumedItems(JTextField amountConsumedItems) {
        this.amountConsumedItems = amountConsumedItems;
    }

    public JTextField getAmountThreadsProductorsProcessing() {
        return amountThreadsProductorsProcessing;
    }

    public void setAmountThreadsProductorsProcessing(JTextField amountThreadsProductorsProcessing) {
        this.amountThreadsProductorsProcessing = amountThreadsProductorsProcessing;
    }

    public JTextField getAmountThreadsProductorsEnded() {
        return amountThreadsProductorsEnded;
    }

    public void setAmountThreadsProductorsEnded(JTextField amountThreadsProductorsEnded) {
        this.amountThreadsProductorsEnded = amountThreadsProductorsEnded;
    }

    public JTextField getAmountThreadsProductorsPending() {
        return amountThreadsProductorsPending;
    }

    public void setAmountThreadsProductorsPending(JTextField amountThreadsProductorsPending) {
        this.amountThreadsProductorsPending = amountThreadsProductorsPending;
    }

    public JTextField getAmountThreadsConsumersProcessing() {
        return amountThreadsConsumersProcessing;
    }

    public void setAmountThreadsConsumersProcessing(JTextField amountThreadsConsumersProcessing) {
        this.amountThreadsConsumersProcessing = amountThreadsConsumersProcessing;
    }

    public JTextField getAmountThreadsConsumersEnded() {
        return amountThreadsConsumersEnded;
    }

    public void setAmountThreadsConsumersEnded(JTextField amountThreadsConsumersEnded) {
        this.amountThreadsConsumersEnded = amountThreadsConsumersEnded;
    }

    public JTextField getAmountThreadsConsumersPending() {
        return amountThreadsConsumersPending;
    }

    public void setAmountThreadsConsumersPending(JTextField amountThreadsConsumersPending) {
        this.amountThreadsConsumersPending = amountThreadsConsumersPending;
    }
}
