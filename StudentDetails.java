import javax.swing.*;

public class StudentDetails extends JFrame {
    JLabel lb_name, lb_rno, lb_address, lb_email, lb_classxii, lb_course, lb_fathername, lb_dob, lb_phone, lb_classx, lb_aadhar, lb_branch;
    JTextField tf_name, tf_rno, tf_address, tf_emial, tf_classxii, tf_course, tf_fathername, tf_dob, tf_phone, tf_classx, tf_aadhar, tf_branch;
    JButton submit, cancel;

    StudentDetails(){

        setSize(850,750);
        setLocation(300,37);

        //Name
        lb_name = new JTextField();
        setVisible(true);
    }

    public static void main (String[] args){
    new StudentDetails();
    }

}
