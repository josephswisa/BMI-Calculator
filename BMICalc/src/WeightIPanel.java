import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeightIPanel extends JPanel {

    JLabel actualWeight;
    static JTextField weightLabel;
    static String weight;

    public WeightIPanel(){
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.actualWeight = new JLabel("Actual Weight:");
        this.weightLabel = new JTextField(3);
        this.add(actualWeight);
        this.add(weightLabel);


    }
}
