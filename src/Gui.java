import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Gui implements ActionListener {

    int count = 0;
    JLabel label;
    JFrame frame;
    JFrame frameOne;
    JPanel panel;
    JPanel panelOne;
    JTextField textEmail;
    JButton button;
    JLabel llabel;
    JButton dogButton;

    public Gui() {

        frame = new JFrame();
        frameOne = new JFrame("Kami", null);
        label = new JLabel("What animal would you like to create?");
        llabel = new JLabel("This should work");
        textEmail = new JTextField(20);
        button = new JButton("Build Dog");
        button.setBackground(Color.yellow);
        button.setForeground((Color.blue));
        // button = new JButton("This should be the dopest button, I swear");
        button.addActionListener(this);
        button.setFont(new java.awt.Font("Arial", Font.BOLD, 24));
        dogButton = new JButton("Build Dog");
        // label = new JLabel("Hit Me");
        // label.setText("Click me Please");
        label.setLabelFor(textEmail);
        label.setOpaque(false);
        label.setBackground(Color.WHITE);
        label.setForeground(Color.RED);
        label.setLabelFor(textEmail);


        JButton addAnimal = new JButton("What would you like to do?", null);

        // Dialog.add(label);
        JPanel panel = new JPanel();
        JPanel questionPanel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder());
        panel.setLayout(new GridLayout(1,2));
        panel.add(button);
        panel.add(dogButton);
        panel.add(label);
        questionPanel.add(llabel);
        questionPanel.add(addAnimal);
        questionPanel.setBorder(BorderFactory.createLineBorder(Color.red));
        questionPanel.setLayout(new BorderLayout());
        // panel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        panel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createEtchedBorder(), "OPERATED & CODED BY, Momin, Yudith, Sebastian, Ray-Ray, Kami"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel, BorderLayout.CENTER);
        frame.setTitle("Group Pet Shelter");
        frame.pack();
        frame.setVisible(true);
        frameOne.add(panelOne, BorderLayout.EAST);
        frameOne.pack();
        frameOne.setTitle("Killa");
        frameOne.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Which animal would you like?  Choose one: ");

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
