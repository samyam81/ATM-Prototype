import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class EngPIN extends JFrame implements ActionListener{
    public static void main(String[] args) {
        new EngPIN();
    }

    JFrame frame;
    JLabel bankLabel;
    JLabel textfield=new JLabel();
    JButton[] numButtons=new JButton[10];  
    JPanel panel;

    String Pin;

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
        frame.setVisible(true);
        
    }

@Override
public void actionPerformed(ActionEvent e) {
    Pin = ""; //Set the pin or it will be error.
     
    for (int i = 0; i < 10; i++) {
        if (e.getSource() == numButtons[i]) {
            Pin += String.valueOf(i);
            textfield.setText(textfield.getText().concat("*"));
        }
    }

  }
}
