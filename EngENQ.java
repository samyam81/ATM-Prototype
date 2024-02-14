import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

// import java.util.Random;


public class EngENQ extends JFrame {
        
    JFrame frame;
    JLabel bankLabel;
    JLabel textfield=new JLabel();

//     double money;    
//     Random rand=new Random();


    Font myFont = new Font("Serrif", Font.ITALIC, 30);

    public EngENQ(){
        
                //Defining the frame
        frame = new JFrame("Pawan Bank PVT LTD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0, 0,0));

                // define the Main text;
        bankLabel = new JLabel("You have:");
        bankLabel.setFont(myFont);
        bankLabel.setForeground(new Color(192,192,192));
        bankLabel.setBounds(150, 100, 400, 50);

                //defining the textfield
        textfield.setBackground(new Color(229, 243, 214));
        textfield.setForeground(new Color(255,0,0)); 
        textfield.setBounds(170,160,300,50);
        textfield.setFont(myFont);
        textfield.setEnabled(false);
        textfield.setOpaque(true);

        // money=rand.nextDouble(25000,50000);
        // textfield.setText("Rs: "+String.valueOf(money));
        
        DBconn dbConn=new DBconn();
        double balance = dbConn.getBalance(1234,"120");
        textfield.setText("Rs: "+String.valueOf(balance));


        frame.add(bankLabel);
        frame.add(textfield);
        frame.setVisible(true);
    }


//     public static void main(String[] args) {
//         new EngENQ();
//     }
}
