import javax.swing.*;
import java.awt.*;

public class EngDONE extends JFrame{

    JFrame frame;
    JLabel bankLabel;

    JLabel motoLabel;
    Font myFont = new Font("Serrif", Font.BOLD, 45);

EngDONE(){

                            // defining the frame;
        frame = new JFrame("Pawan Bank PVT LTD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0, 0,0));

                        // Defining the heading
        bankLabel = new JLabel("Done!!!");
        bankLabel.setFont(myFont);
        bankLabel.setForeground(new Color(192,192,192));
        bankLabel.setBounds(200, 100, 500, 50);

                //Defining the banklabel(Moto)
        motoLabel = new JLabel("Take your card.");
        motoLabel.setFont(myFont);
        motoLabel.setForeground(new Color(188,198,204));
        motoLabel.setBounds(200,150, 650, 80);

        frame.add(bankLabel);
        frame.add(motoLabel);
        frame.setVisible(true);
}

}
