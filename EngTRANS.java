import javax.swing.*;
import java.awt.*;

public class EngTRANS extends JFrame{
    public static void main(String[] args) {
         new EngTRANS();
    }

    JFrame frame;
    JLabel bankLabel;
    JButton Withdrawl;
    JButton Tranfer;
    JButton Payment;
    JButton Enquiry;

    Font myFont = new Font("Dialog", Font.BOLD, 30);
    Font myFont1 = new Font("Monospaced", Font.BOLD, 25);

    EngTRANS(){
        // defining the frame;
        frame = new JFrame("Pawan Bank PVT LTD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0, 0,0));

        // define the Main text;
        bankLabel = new JLabel("Select a Transaction");
        bankLabel.setFont(myFont);
        bankLabel.setForeground(new Color(192,192,192));
        bankLabel.setBounds(150, 100, 400, 50);

        // defining the Withdrawl button;
        Withdrawl=new JButton("Withdrawl");
        Withdrawl.setFont(myFont1);
        Withdrawl.setFocusable(false);
        Withdrawl.setBackground(new Color(112, 128, 144));
        Withdrawl.setForeground(new Color(249, 246, 238));
        Withdrawl.setBounds(15,250,180,50);

        //defining the Transfer button;
        Tranfer=new JButton("Transfer");
        Tranfer.setFont(myFont1);
        Tranfer.setFocusable(false);
        Tranfer.setBackground(new Color(112, 128, 144));
        Tranfer.setForeground(new Color(249, 246, 238));
        Tranfer.setBounds(15,315,180,50);

                //defining the Payment button;
        Payment=new JButton("Payment");
        Payment.setFont(myFont1);
        Payment.setFocusable(false);
        Payment.setBackground(new Color(112, 128, 144));
        Payment.setForeground(new Color(249, 246, 238));
        Payment.setBounds(560,250,150,50);

                //defining the Enquiry button;
        Enquiry=new JButton("Enquiry");
        Enquiry.setFont(myFont1);
        Enquiry.setFocusable(false);
        Enquiry.setBackground(new Color(112, 128, 144));
        Enquiry.setForeground(new Color(249, 246, 238));
        Enquiry.setBounds(560,315,150,50);


        //Setting the frame
        frame.add(Withdrawl);
        frame.add(Tranfer);
        frame.add(Payment);
        frame.add(Enquiry);
        frame.add(bankLabel);
        frame.setVisible(true);
    }

}
