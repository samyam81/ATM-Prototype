import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class EngWITH extends JFrame implements ActionListener {
        
//     public static void main(String[] args) {
//         new EngWITH();
//     }

    JFrame frame;
    JLabel bankLabel;
    JButton fiveHundred;
    JButton thousand;
    JButton thousand2;
    JButton thousand5;
    JButton thousand10;
    JButton thousand25;

    Font myFont = new Font("Serrif", Font.PLAIN, 15);
    Font myFont1 = new Font("Monospaced", Font.BOLD, 30);

    double balance;

    public EngWITH(){

                // Defing the frame
        frame = new JFrame("Pawan Bank PVT LTD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0, 0,0));

                // define the Main text;
        bankLabel = new JLabel("Withdrawal Amount");
        bankLabel.setFont(myFont1);
        bankLabel.setForeground(new Color(192,192,192));
        bankLabel.setBounds(150, 100, 400, 50);

                // Button for Five Hundred Rupees
        fiveHundred=new JButton("Rupees Five Hundred");
        fiveHundred.setFont(myFont);
        fiveHundred.addActionListener(this);
        fiveHundred.setBackground(new Color(112, 128, 144));
        fiveHundred.setForeground(new Color(249, 246, 238));       
        fiveHundred.setBounds(15,200,230,50);
        fiveHundred.setFocusable(false);

                // button for thousand
        thousand=new JButton("Rupees Thousand");
        thousand.setFont(myFont);
        thousand.addActionListener(this);
        thousand.setBackground(new Color(112, 128, 144));
        thousand.setForeground(new Color(249, 246, 238));       
        thousand.setBounds(15,280,230,50);
        thousand.setFocusable(false);

                 // button for two-thousand
        thousand2=new JButton("Rupees Two Thousand");
        thousand2.setFont(myFont);
        thousand2.addActionListener(this);       
        thousand2.setBackground(new Color(112, 128, 144));
        thousand2.setForeground(new Color(249, 246, 238));       
        thousand2.setBounds(15,360,230,50);
        thousand2.setFocusable(false);

                // button for five-thousand
        thousand5=new JButton("Rupees Five Thousand");
        thousand5.setFont(myFont);
        thousand5.addActionListener(this);
        thousand5.setBackground(new Color(112, 128, 144));
        thousand5.setForeground(new Color(249, 246, 238));       
        thousand5.setBounds(500,200,230,50);
        thousand5.setFocusable(false);

                // button for five-thousand
        thousand10=new JButton("Rupees Ten Thousand");
        thousand10.setFont(myFont);
        thousand10.addActionListener(this);
        thousand10.setBackground(new Color(112, 128, 144));
        thousand10.setForeground(new Color(249, 246, 238));       
        thousand10.setBounds(500,280,230,50);
        thousand10.setFocusable(false);

                        // button for five-thousand
        thousand25=new JButton(" Twenty-Five Thousand");
        thousand25.setFont(myFont);
        thousand25.addActionListener(this);
        thousand25.setBackground(new Color(112, 128, 144));
        thousand25.setForeground(new Color(249, 246, 238));       
        thousand25.setBounds(500,360,230,50);
        thousand25.setFocusable(false);

        frame.add(bankLabel);
        frame.add(fiveHundred);
        frame.add(thousand);
        frame.add(thousand2);
        frame.add(thousand5);
        frame.add(thousand10);
        frame.add(thousand25);
        frame.setVisible(true);
    }
    
@Override
public void actionPerformed(ActionEvent e){
  if (e.getSource()==fiveHundred) {
        DBconn dbConn=new DBconn(); 
         double balance = dbConn.getBalance(1234,"120");
        if (balance >=500) {
         // Calculate the new balance after deducting 500
            double newBalance = balance - 500;

            // Update the balance in the database
            dbConn.updateBalance(1234, "120", newBalance);
            new EngDONE();
        }else{
                new EngOFO();
        }
  }
    if (e.getSource()==thousand) {
        DBconn dbConn=new DBconn(); 
         double balance = dbConn.getBalance(1234,"120");
        if (balance >=1000) {
         // Calculate the new balance after deducting 1000
            double newBalance = balance - 1000;

            // Update the balance in the database
            dbConn.updateBalance(1234, "120", newBalance);
            new EngDONE();
        }else{
                new EngOFO();
        }
  }
     if (e.getSource()==thousand2) {
        DBconn dbConn=new DBconn(); 
         double balance = dbConn.getBalance(1234,"120");
        if (balance >=2000) {
         // Calculate the new balance after deducting 2000
            double newBalance = balance - 2000;

            // Update the balance in the database
            dbConn.updateBalance(1234, "120", newBalance);
            new EngDONE();
        }else{
                new EngOFO();
        }
  }
       if (e.getSource()==thousand5) {
        DBconn dbConn=new DBconn(); 
         double balance = dbConn.getBalance(1234,"120");
        if (balance >=5000) {
         // Calculate the new balance after deducting 5000
            double newBalance = balance - 5000;

            // Update the balance in the database
            dbConn.updateBalance(1234, "120", newBalance);
            new EngDONE();
        }else{
                new EngOFO();
        }
  }
       if (e.getSource()==thousand10) {
        DBconn dbConn=new DBconn(); 
         double balance = dbConn.getBalance(1234,"120");
        if (balance >=10000) {
         // Calculate the new balance after deducting 10000
            double newBalance = balance - 10000;

            // Update the balance in the database
            dbConn.updateBalance(1234, "120", newBalance);
            new EngDONE();
        }else{
                new EngOFO();
        }
  }
       if (e.getSource()==thousand25) {
        DBconn dbConn=new DBconn(); 
         double balance = dbConn.getBalance(1234,"120");
        if (balance >=25000) {
         // Calculate the new balance after deducting 25000
            double newBalance = balance - 25000;

            // Update the balance in the database
            dbConn.updateBalance(1234, "120", newBalance);
            new EngDONE();
        }else{
                new EngOFO();
        }
  }
}

}
