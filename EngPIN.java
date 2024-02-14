import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class EngPIN extends JFrame implements ActionListener{
    
    public static void main(String[] args) {
        new EngPIN();
    }

    JFrame frame;
    JLabel bankLabel;
    JLabel textfield=new JLabel();
    JButton[] numButtons=new JButton[10];  
    JPanel panel;
    JButton delButton,OkButton;
  String Pin="";
 

    Font myFont = new Font("Dialog", Font.BOLD, 30);
    EngPIN(){
        //Defining the frame
        frame = new JFrame("Pawan Bank PVT LTD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0, 0,0));

        // Defining the heading
        bankLabel = new JLabel("Enter your Pin");
        bankLabel.setFont(myFont);
        bankLabel.setForeground(new Color(192,192,192));
        bankLabel.setBounds(200, 100, 400, 50);

        //defining the textfield
        textfield.setBackground(new Color(229, 243, 214));
        textfield.setForeground(new Color(255,0,0)); 
        textfield.setBounds(170,160,300,50);
        textfield.setFont(myFont);
        textfield.setEnabled(false);
        textfield.setOpaque(true);

        //defining the Numbers
        for (int i = 0; i < 10; i++) {
                numButtons[i]=new JButton(String.valueOf(i));
                numButtons[i].addActionListener(this);
                numButtons[i].setFont(myFont);
                numButtons[i].setFocusable(false);
        }
                // defining the Delete button
        delButton=new JButton("del");
        delButton.addActionListener(this);
        delButton.setFont(myFont);
        delButton.setContentAreaFilled(true);
        delButton.setFocusable(false);
        delButton.setBounds(170, 460, 90, 70);

                    //defining The Okay Button
        OkButton=new JButton("Ok");
        OkButton.addActionListener(this);
        OkButton.setFont(myFont);
        OkButton.setFocusable(false);
        OkButton.setContentAreaFilled(true);
        OkButton.setBounds(380, 460, 90, 70);


        //  Defining the Panel.
        panel=new JPanel();
        panel.setBounds(170,230,300,299);
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.setBackground(Color.BLACK);

        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);

        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);

        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);

        panel.add(new JLabel(" "));
        panel.add(numButtons[0]);

        //Setting the Frame
        frame.add(panel);
        frame.setLayout(null);
        frame.add(textfield);
        frame.add(bankLabel);
        frame.add(delButton);
        frame.add(OkButton);
        frame.setVisible(true);
        
    }

@Override
public void actionPerformed(ActionEvent e) {
     
     
  for (int i = 0; i < 10; i++) {
      if (e.getSource() == numButtons[i]) {
        Pin += String.valueOf(i);
        textfield.setText(textfield.getText().concat("*"));
      }
}
        if(e.getSource()==delButton){
            String string=textfield.getText();
            textfield.setText("");
            for (int i = 0; i < string.length()-1; i++) {
                textfield.setText(textfield.getText()+string.charAt(i));
            }
        }



if (e.getSource() == OkButton) {
    // This was to check the Value of PIN. <3
    // System.out.println("Pin value before setting textfield: " + Pin);
    // textfield.setText(Pin);

    try {
        String pass = String.valueOf(Pin);

        DBconn conn = new DBconn();

        // Use PreparedStatement to avoid SQL injection
        String query = "SELECT * FROM login10 WHERE PIN = ?";
        PreparedStatement preparedStatement = conn.connection.prepareStatement(query);
        preparedStatement.setString(1, pass);  // Set the PIN parameter

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            // PIN is correct, proceed to the next step
            new EngTRANS();
        } else {
            // PIN is incorrect, display a message
            textfield.setText("Invalid PIN");
        }

    } catch (Exception E) {
        E.printStackTrace();
    }
 }

}
}

