import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class Splash extends JFrame implements ActionListener{


    JFrame frame;
    JLabel language;
    JLabel bankLabel;
    JLabel motoLabel;
    JLabel moto1Label;
    JButton english;
    JButton  Nepali;


    Font bankLabelFont = new Font("Serif", Font.BOLD, 30);
    Font motoLabelFont = new Font("Dialog", Font.ITALIC, 18);
    Font engFont = new Font("Dialog", Font.BOLD, 15);
    Splash() {

        // Defing the frame
        frame = new JFrame("Pawan Bank PVT LTD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0, 0,0));

        //Defining the banklabel(NameLabel)
        bankLabel = new JLabel("Pawan Bank Pvt LTD");
        bankLabel.setFont(bankLabelFont);
        bankLabel.setForeground(new Color(192,192,192));
        bankLabel.setBounds(150, 100, 400, 50);

        //Defining the banklabel(Moto)
        motoLabel = new JLabel("Serving the Best");
        motoLabel.setFont(motoLabelFont);
        motoLabel.setForeground(new Color(188,198,204));
        motoLabel.setBounds(200,150, 150, 80);


        // // Defining the motoNepali
        // moto1Label = new JLabel("उत्कृष्ट सेवा गर्दै");
        // moto1Label.setFont(motoLabelFont);
        // moto1Label.setForeground(new Color(188,198,204));
        // moto1Label.setBounds(200,240, 150, 80);


        //Defining the Languages
        language=new JLabel("Choose Language");
        language.setFont(bankLabelFont);
        language.setForeground(new Color(223, 225, 223));
        language.setBounds(495,370,300,42);

        //English Language
        english=new JButton(" English ");
        english.setFont(engFont);
        english.addActionListener(this);
        english.setFocusable(false);
        english.setBackground(new Color(112, 128, 144));
        english.setForeground(new Color(249, 246, 238));
        english.setBounds(585,421,142,45);

        //Nepali Language
        Nepali=new JButton(" Nepali ");
        Nepali.setFont(engFont);
        Nepali.setFocusable(false);
        Nepali.setBackground(new Color(112, 128, 144));
        Nepali.setForeground(new Color(249, 246, 238));
        Nepali.setBounds(585,476,142,45);


        frame.add(bankLabel);
        frame.add(motoLabel);
        // frame.add(moto1Label);
        frame.add(language);
        frame.add(english);
        frame.add(Nepali);
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        new Splash();
    }

    @Override
public void actionPerformed(ActionEvent e){
    if (e.getSource()==english) {
        new EngTRANS();
    }
}
}
