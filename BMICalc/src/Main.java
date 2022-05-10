import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static final int WINDOW_WIDTH = 600;
    public static final int WINDOW_HEIGHT = 600;
    static double height;
    static String  weight;
    static double bodyFrame;
    static String ageAsString;


    public static void main(String[] args) {
         ageAsString = JOptionPane.showInputDialog("Enter your age:");
        new Main();
    }

    public Main(){
        this.setLayout(new GridLayout(6,1));
        this.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(new BmiCalc());
        this.add(new GenderPanel());
        this.add(new HeightSlider());
        this.add(new BodyFrame());
        this.add(new WeightIPanel());
        this.add(new CalculatePanel());
        this.setVisible(true);
    }

    public static void Calculate(){
        int weightAsInt = Integer.parseInt(weight);
        double bmi = weightAsInt/Math.pow(height/100,2);
        int ageAsInt = Integer.parseInt(ageAsString);
       String result="";
      if (bmi <15) result="Anorexic";
      else if(bmi < 18.5) result ="Underweight";
      else if(bmi <24.9) result="Normal";
      else if(bmi < 29.9) result="Overweight";
      else if(bmi <35) result="Obese";
      else if(bmi >35) result="EXTREME OBESE";

      double idealWeight = (height - 100 + (ageAsInt /10) )*0.9*bodyFrame;

      JOptionPane.showMessageDialog(null,"BMI:"+ bmi+" "+result);
      JOptionPane.showMessageDialog(null,"Actual weight: "+weightAsInt+" Ideal Weight: "+idealWeight);


    }
}
