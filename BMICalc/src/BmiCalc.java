import javax.swing.*;
import java.awt.*;

import static java.awt.Image.SCALE_SMOOTH;

public class BmiCalc extends JPanel {
    JLabel headLine;

    public BmiCalc(){
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.headLine= new JLabel();
        ImageIcon bmi_Image = new ImageIcon("bmi.png");
        Image scaleImage = bmi_Image.getImage().getScaledInstance(130, 90, SCALE_SMOOTH);
        bmi_Image = new ImageIcon(scaleImage);
        this.headLine.setIcon(bmi_Image);
        this.add(this.headLine);

    }
}
