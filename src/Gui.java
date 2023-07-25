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
    JPanel panel;
    JTextField textEmail;
    JButton button;
    JLabel llabel;

    public Gui() {

        frame = new JFrame();
        label = new JLabel("Enter e-mail address:");
        llabel = new JLabel("This should work");
        textEmail = new JTextField(20);
        button = new JButton(new ImageIcon("/Users/6ix5ini/WCCI/GUI/GUI/src/Quoter.jpg"));
        // button = new JButton("This should be the dopest button, I swear");
        button.addActionListener(this);
        button.setFont(new java.awt.Font("Arial", Font.BOLD, 14));
        // label = new JLabel("Hit Me");
        // label.setText("Click me Please");
        label.setLabelFor(textEmail);
        label.setOpaque(false);
        label.setBackground(Color.WHITE);
        label.setForeground(Color.RED);
        label.setLabelFor(textEmail);

        // Dialog.add(label);
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder());
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        // panel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        panel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createEtchedBorder(), "Kami Isaacs was here"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel, BorderLayout.CENTER);
        frame.setTitle("My GUI");
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of time you hit me!: " + count);

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
