import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EngPAY extends JFrame implements ActionListener{

    JFrame frame;
    JLabel bankLabel;
    JLabel motoLabel;
    JLabel textfield=new JLabel();
    JButton[] numButtons=new JButton[10];  
    JButton delButton, OkButton;
    JPanel panel;

    String Banknumber;

    Font myFont = new Font("Dialog", Font.BOLD, 30);
    Font myFont1 = new Font("Monospaced", Font.BOLD, 20);
     public EngPAY(){
                // defining the frame;
        frame = new JFrame("Pawan Bank PVT LTD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0, 0,0));

                // define the Main text;
        bankLabel = new JLabel("Payment Mode");
        bankLabel.setFont(myFont);
        bankLabel.setForeground(new Color(192,192,192));
        bankLabel.setBounds(200, 100, 400, 50);

                //Defining the Moto
        motoLabel = new JLabel("Enter the Account Number");
        motoLabel.setFont(myFont1);
        motoLabel.setForeground(new Color(188,198,204));
        motoLabel.setBounds(200,150, 300, 80);

        //defining the textfield
        textfield.setBackground(new Color(229, 243, 214));
        textfield.setForeground(new Color(255,0,0)); 
        textfield.setBounds(170,250,300,50);
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
        delButton.setFocusable(false);
        delButton.setBounds(170, 540, 90, 70);

            //defining The Okay Button
        OkButton=new JButton("Ok");
        OkButton.addActionListener(this);
        OkButton.setFont(myFont);
        OkButton.setFocusable(false);
        OkButton.setBounds(380, 540, 90, 70);

        //  Defining the Panel.
        panel=new JPanel();
        panel.setBounds(170,310,300,299);
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

        panel.add(new JLabel(""));
        panel.add(numButtons[0]);

        frame.add(panel);
        frame.add(delButton);
        frame.add(OkButton);        
        frame.add(textfield);
        frame.add(bankLabel);
        frame.add(motoLabel);
        frame.setVisible(true);

    }

    // public static void main(String[] args) {
    //     new EngPAY();
    // }

@Override
public void actionPerformed(ActionEvent e){
    Banknumber="";
        for (int i = 0; i < 10; i++) {
        if (e.getSource() == numButtons[i]) {
            Banknumber += String.valueOf(i);
            textfield.setText(textfield.getText().concat(Banknumber));
        }
    }
        if(e.getSource()==delButton){
            String string=textfield.getText();
            textfield.setText("");
            for (int i = 0; i < string.length()-1; i++) {
                textfield.setText(textfield.getText()+string.charAt(i));
            }
        }
        if(e.getSource()==OkButton){
            new EngAMT();
        }

}    
}
