import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {


    Dashboard() {
        setSize(1540,850);

        //Image Configuration
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1540,850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        //creating Menu-Bar
        JMenuBar mb = new JMenuBar();
        JMenu newInfo =  new JMenu("Information");
        mb.add(newInfo);
        JMenu vwDetail =  new JMenu("View Details");
        mb.add(vwDetail);
        JMenu appleave =  new JMenu("Information");
        mb.add(appleave);
        JMenu lDetails =  new JMenu("Leave Details");
        mb.add(lDetails);
        JMenu examinations =  new JMenu("Examinationsf");
        mb.add(examinations);
        JMenu upDetails =  new JMenu("Update Details");
        mb.add(upDetails);
        JMenu feeDetails =  new JMenu("Fee Details");
        mb.add(feeDetails);
        JMenu utility =  new JMenu("Utility");
        mb.add(utility);
        JMenu exit =  new JMenu("Exit");
        mb.add(exit);
        setJMenuBar(mb);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
