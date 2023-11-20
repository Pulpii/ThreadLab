import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel{
    private JButton playPauseButton;
    private JButton restartButton;
    private JCheckBox saveCriticRegions;
    private JCheckBox positiveStockProducts;

    public ControlPanel(GridBagConstraints c, ActionListener actionListener){
        this.playPauseButton = new JButton("Play");
        this.restartButton = new JButton("Restart");

        JLabel saveCriticLabel = new JLabel("Protect critic regions");
        saveCriticLabel.setForeground(Color.white);
        this.saveCriticRegions = new JCheckBox();

        JLabel positiveStockLabel = new JLabel("Stock product positive");
        positiveStockLabel.setForeground(Color.white);
        this.positiveStockProducts = new JCheckBox();

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

        this.playPauseButton.setBackground(Color.decode("#de6f1f"));
        this.playPauseButton.setForeground(Color.BLACK);
        this.playPauseButton.addActionListener(actionListener);
        this.add(playPauseButton, c);

        c.gridx = 1;
        this.restartButton.setBackground(Color.decode("#fc8d3d"));
        this.restartButton.setForeground(Color.BLACK);
        this.restartButton.addActionListener(actionListener);
        this.add(restartButton, c);

        c.gridx = 2;
        this.add(saveCriticLabel, c);
        c.gridx = 3;
        this.add(saveCriticRegions, c);
        c.gridx = 4;
        this.add(positiveStockLabel, c);
        c.gridx = 5;
        this.add(positiveStockProducts, c);
    }


    public JButton getPlayPauseButton() {
        return playPauseButton;
    }

    public void setPlayPauseButton(JButton playPauseButton) {
        this.playPauseButton = playPauseButton;
    }

    public JButton getRestartButton() {
        return restartButton;
    }

    public void setRestartButton(JButton restartButton) {
        this.restartButton = restartButton;
    }

    public JCheckBox getSaveCriticRegions() {
        return saveCriticRegions;
    }

    public void setSaveCriticRegions(JCheckBox saveCriticRegions) {
        this.saveCriticRegions = saveCriticRegions;
    }

    public JCheckBox getPositiveStockProducts() {
        return positiveStockProducts;
    }

    public void setPositiveStockProducts(JCheckBox positiveStockProducts) {
        this.positiveStockProducts = positiveStockProducts;
    }
}
