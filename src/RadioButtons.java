import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtons extends JFrame implements ActionListener {

    static String rCatString = "Robot Cat";
    static String rDogString = "Robot Dawg";
    static String oCatString = "Organic Cat";
    static String oDogString = "Organic Dog";

    ImageIcon dogIcon = new ImageIcon("src/cuteDog.jpg");
    ImageIcon roboDogIcon = new ImageIcon("src/RobotDawg.jpg");
    ImageIcon robotCatIcon = new ImageIcon("src/RoboCat3.JPG");
    ImageIcon catIcon = new ImageIcon("src/CuteCat.jpg");

    JRadioButton rCatButton = new JRadioButton(rCatString);
    JRadioButton rDogButton = new JRadioButton(rDogString); // roboDogIcon);
    JRadioButton oCatButton = new JRadioButton(oCatString); // catIcon);
    JRadioButton oDogButton = new JRadioButton(oDogString);// , dogIcon);

    JLabel picLabel = new JLabel();
    JPanel radioPanel = new JPanel(new GridLayout(0, 1)); // Left panel to hold radio buttons. Unlimited rows and just
                                                          // one column
    JFrame frame = new JFrame(); // Main frame
    JPanel s = new JPanel(new BorderLayout()); // Test panel
    JPanel textPanel = new JPanel(new BorderLayout());
    TextField name = new TextField();
    JButton submit = new JButton("Submit");
    ButtonGroup group = new ButtonGroup();

    public RadioButtons() {

        frame.pack();
        frame.add(radioPanel, BorderLayout.LINE_START);
        frame.add(picLabel, BorderLayout.CENTER);
        frame.add(textPanel, BorderLayout.SOUTH);
        textPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 7));
        textPanel.setPreferredSize(new Dimension(100, 100));
        textPanel.add(name, BorderLayout.EAST);
        textPanel.add(submit, BorderLayout.LINE_START);
        name.setPreferredSize(new Dimension(600, 50));
        name.setFont(new Font("Consolas", Font.BOLD, 30));
        name.setBackground(Color.WHITE);
        name.setForeground(Color.RED);

        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.setTitle("Pets Run Amok!!!");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        radioPanel.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
        radioPanel.add(rCatButton);
        radioPanel.add(rDogButton);
        radioPanel.add(oCatButton);
        radioPanel.add(oDogButton);

        rCatButton.addActionListener(this);
        rCatButton.setActionCommand(rCatString);
        rCatButton.setSelected(true);
        rDogButton.addActionListener(this);
        rDogButton.setActionCommand(rDogString);
        oCatButton.addActionListener(this);
        oCatButton.setActionCommand(oCatString);
        oDogButton.addActionListener(this);
        oDogButton.setActionCommand(oDogString);
        submit.addActionListener(this);

        group.add(rCatButton);
        group.add(rDogButton);
        group.add(oCatButton);
        group.add(oDogButton);

        // picLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));
        // picLabel.setPreferredSize(new Dimension(177, 122));
        // picLabel.add(rCatButton);
        // picLabel.add(rDogButton);
        // picLabel.add(oCatButton);
        // picLabel.add(oDogButton);

    }

    // public JRadioButton getrCatButton() {
    // return rCatButton;
    // }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == rCatButton) {
            picLabel.setIcon(robotCatIcon);
            System.out.println("Clicked Robot cat");

        }

        if (e.getSource() == rDogButton) {
            picLabel.setIcon(roboDogIcon);
            System.out.println("Clicked Robot dog clicked");
        }

        if (e.getSource() == oCatButton) {
            picLabel.setIcon(catIcon);
            System.out.println("Organic Cat Clicked");
        }

        if (e.getSource() == oDogButton) {
            picLabel.setIcon(dogIcon);
            System.out.println("Organic dog Clicked");
        }


        if (e.getSource() == submit){
            System.out.println("Your pets name is " + name.getText());
        }

        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
