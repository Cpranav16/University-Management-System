import javax.swing.*;
import java.awt.*;

// using JFrame for the window screen using Swing for Desktop Application
public class Splash extends JFrame {
    public Splash() {
        // Storing Image in object(i1) using ImageIcon Class from System-Resoure to be loaded in JFrame,
        // Scaling img as req. and storing as image(i2)
        // But Scaled img cant be Loaded directly so needed to convert into ImageIcon(i3),
        // JLabel to show in JFrame and add() for adding in JFrame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1000,700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

// Setting JFrame configuration True bcz its always hidden,
// Setting Location from X-axis & Y-axis,
// Setting Size from where tobe Visible.
        setVisible(true);
        for (int i = 0; i<=400; i++) {
            setLocation(300,50);
            setSize(2*i+110,2*i-60);
        }
    }


    public static void main(String[] args) {
        Splash s =new Splash();
    }
}
