import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {


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
        JMenuItem facInfo = new JMenuItem("Faculty Information");
        newInfo.add(facInfo);
        JMenuItem stdInfo = new JMenuItem("Student Information");
        newInfo.add(stdInfo);

        JMenu vwDetail =  new JMenu("View Details");
        mb.add(vwDetail);
        JMenuItem facvw = new JMenuItem("Faculty Details");
        vwDetail.add(facvw);
        JMenuItem stdvw = new JMenuItem("Student Details");
        vwDetail.add(stdvw);


        JMenu appleave =  new JMenu("Apply Leave");
        mb.add(appleave);
        JMenuItem faclv = new JMenuItem("Faculty Leave");
        appleave.add(faclv);
        JMenuItem stdlv = new JMenuItem("Student Leave");
        appleave.add(stdlv);


        JMenu lDetails =  new JMenu("Leave Details");
        mb.add(lDetails);
        JMenuItem facDl = new JMenuItem("Faculty Leave Details");
        lDetails.add(facDl);
        JMenuItem stdDl = new JMenuItem("Student Leave Details");
        lDetails.add(stdDl);


        JMenu examinations =  new JMenu("Examinations");
        mb.add(examinations);
        JMenuItem ExmRes = new JMenuItem("Exam's Results");
        examinations.add(ExmRes);
        JMenuItem EntMarks = new JMenuItem("Enter Marks");
        examinations.add(EntMarks);


        JMenu upDetails =  new JMenu("Update Details");
        mb.add(upDetails);
        JMenuItem facup = new JMenuItem("Update Faculty Details");
        upDetails.add(facup);
        JMenuItem stdup = new JMenuItem("Update Student Details");
        upDetails.add(stdup);


        JMenu feeDetails =  new JMenu("Fee Details");
        mb.add(feeDetails);
        JMenuItem stdFee = new JMenuItem("Fee Structure");
        feeDetails.add(stdFee);
        JMenuItem stdFeeForm = new JMenuItem("Student Fee Form");
        feeDetails.add(stdFeeForm);


        JMenu utility =  new JMenu("Utility");
        mb.add(utility);
        JMenuItem calc = new JMenuItem("Calculator");
        utility.add(calc);
        JMenuItem Notepd = new JMenuItem("Notepad");
        utility.add(Notepd);


        JMenu exit =  new JMenu("Exit");
        mb.add(exit);
        JMenuItem cl = new JMenuItem("Close");

        exit.add(cl);
        JMenuItem Signout = new JMenuItem("Sign Out");
        exit.add(Signout);

        setJMenuBar(mb);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
