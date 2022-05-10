import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatePanel extends JPanel {

    JButton calcButton;
    String weight;

    public CalculatePanel(){
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.calcButton = new JButton("Calculate");
        this.add(calcButton);

        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.weight = WeightIPanel.weightLabel.getText();
                Main.Calculate();
            }
        });
    }
}
