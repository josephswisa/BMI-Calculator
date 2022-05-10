import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BodyFrame extends JPanel {
    JButton small;
    JButton medium;
    JButton large;
    JLabel bodyLabel;

    public BodyFrame(){
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.small=new JButton("Small");
        this.medium= new JButton("Medium");
        this.large = new JButton("Large");
        this.bodyLabel = new JLabel("Body-Frame:");
        this.add(bodyLabel);
        this.add(small);
        this.add(medium);
        this.add(large);

        small.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.bodyFrame = 0.9;
            }
        });

        medium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.bodyFrame = 1;
            }
        });

        large.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.bodyFrame = 1.1;
            }
        });
    }
}
