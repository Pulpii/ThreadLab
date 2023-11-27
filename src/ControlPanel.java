import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel{
    private JToggleButton playPause;
    private JButton reset;
    private JCheckBox protectCriticalRegions;
    private JCheckBox preventNegativeStocks;

    public ControlPanel(GridBagConstraints c, ActionListener actionListener){
        this.playPause = new JToggleButton("Play");
        this.reset = new JButton("Restart");

        JLabel saveCriticLabel = new JLabel("Protect critic regions");
        saveCriticLabel.setForeground(Color.white);
        this.protectCriticalRegions = new JCheckBox();

        JLabel positiveStockLabel = new JLabel("Stock product positive");
        positiveStockLabel.setForeground(Color.white);
        this.preventNegativeStocks = new JCheckBox();

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

        this.playPause.setBackground(Color.decode("#de6f1f"));
        this.playPause.setForeground(Color.BLACK);
        this.playPause.addActionListener(actionListener);
        this.add(playPause, c);

        c.gridx = 1;
        this.reset.setBackground(Color.decode("#fc8d3d"));
        this.reset.setForeground(Color.BLACK);
        this.reset.addActionListener(actionListener);
        this.add(reset, c);

        c.gridx = 2;
        this.add(saveCriticLabel, c);
        c.gridx = 3;
        this.add(protectCriticalRegions, c);
        c.gridx = 4;
        this.add(positiveStockLabel, c);
        c.gridx = 5;
        this.add(preventNegativeStocks, c);
    }


    public JToggleButton getPlayPause() {
        return playPause;
    }

    public void setPlayPause(JToggleButton playPause) {
        this.playPause = playPause;
    }

    public JButton getReset() {
        return reset;
    }

    public void setReset(JButton reset) {
        this.reset = reset;
    }

    public JCheckBox getProtectCriticalRegions() {
        return protectCriticalRegions;
    }

    public void setProtectCriticalRegions(JCheckBox protectCriticalRegions) {
        this.protectCriticalRegions = protectCriticalRegions;
    }

    public JCheckBox getPreventNegativeStocks() {
        return preventNegativeStocks;
    }

    public void setPreventNegativeStocks(JCheckBox preventNegativeStocks) {
        this.preventNegativeStocks = preventNegativeStocks;
    }
}
