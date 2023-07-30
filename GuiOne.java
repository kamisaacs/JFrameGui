import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;

public class GuiOne implements ActionListener {

    // Sets up the window
    JFrame frame = new JFrame();
    // Puts a layout in the window we just made
    JPanel contentPane = new JPanel(new GridLayout(2, 1));
    JPanel secondContentPane = new JPanel();

    JButton organicDog = new JButton("Create Organic Dog");
    JButton organicCat = new JButton("Create Organic Cat");

    // private Icon dogString;
    JButton aiDogButton = new JButton("Create AiDog");
    JButton aiCatButton = new JButton("Create AiCat");
    JButton organicCatButton = new JButton("Create Organic Cat");
    JButton organicDogButton = new JButton("Create Organic Dog");

    JLabel createAiDogLabel = new JLabel();
    JLabel createAiCatLabel = new JLabel();
    JLabel createOrganicDogLabel = new JLabel();
    JLabel createOrganicCatLabel = new JLabel();
    ImageIcon dogIcon = new ImageIcon("cuteDog.jpg");
    ImageIcon roboDogIcon = new ImageIcon("RobotDog.jpg");
    ImageIcon robotCatIcon = new ImageIcon("RobotCat.jpg");
    ImageIcon catIcon = new ImageIcon("CuteCat.jpg");

    public GuiOne() {

        frame.setTitle("RoboticShelter");
        frame.setVisible(true);
        // Add the panel to the Frame
        frame.add(contentPane);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(1000, 1000);

        contentPane.setBorder(BorderFactory.createLineBorder(Color.RED));

        secondContentPane.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        contentPane.setOpaque(true);
        contentPane.add(createAiDogLabel);
        contentPane.add(secondContentPane);

        secondContentPane.add(aiDogButton);
        // aiDogButton.setBounds(100, 100, 500, 50);
        aiDogButton.setIcon(dogIcon);
        aiDogButton.setOpaque(true);
        aiDogButton.setBackground(Color.BLACK);
        aiDogButton.addActionListener(this);
        createAiDogLabel.setBounds(200, 100, 100, 100);
        secondContentPane.add(createAiDogLabel);
        createAiDogLabel.setText(null);

        secondContentPane.add(aiCatButton);
        // aiCatButton.setBounds(100, 200, 500, 50);
        aiCatButton.setOpaque(true);
        aiCatButton.setBackground(Color.DARK_GRAY);

        secondContentPane.add(organicCatButton);
        // aiCatButton.setBounds(100, 200, 500, 50);
        organicCatButton.setOpaque(true);
        organicCatButton.setBackground(Color.DARK_GRAY);

        secondContentPane.add(organicDogButton);
        organicDogButton.setOpaque(true);
        organicDogButton.setBackground(Color.GREEN);

        createAiCatLabel.setBounds(10, 10, 50, 50);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to name your dog?");
        String name = input.nextLine();
        createAiDogLabel.setText("Your dogs name is: " + name);

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public void actionButton() {

    }

    

}
