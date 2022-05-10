import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GenderPanel extends JPanel {

    JLabel genderLabel;
    JButton maleButton;
    JButton femaleButton;
    public GenderPanel(){
        this.setLayout(new FlowLayout(FlowLayout.LEADING,5,10));
        this.genderLabel = new JLabel("Gender:");
        this. maleButton = new JButton("Male");
        this. femaleButton = new JButton("Female");
        this.add(genderLabel);
        this.add(maleButton);
        this.add(femaleButton);

        maleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Male is chosen");

            }
        });

        femaleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("female is chosen");
            }
        });
    }


}
