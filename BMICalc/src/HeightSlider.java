import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class HeightSlider extends JPanel {

    private JSlider heightSlider;
    private JLabel heightLabel;

    public HeightSlider(){
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.heightLabel = new JLabel("Height:");
        this.heightSlider = new JSlider (JSlider.HORIZONTAL,0, 200, 0);
        this.heightSlider.setMajorTickSpacing (50);
        this.heightSlider.setMinorTickSpacing (10);
        this.heightSlider.setPaintTicks (true);
        this.heightSlider.setPaintLabels (true);
        this.add(heightLabel);
        this.add(heightSlider);

        heightSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Main.height = heightSlider.getValue();
               // System.out.println("Static:"+Main.height);
            }
        });

    }



    //@Override
  //  public void stateChanged(ChangeEvent e) {
  //      Main.height = heightSlider.getValue();
  //  System.out.println(Main.height);
//
  //  }
}
