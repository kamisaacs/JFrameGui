import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
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
    // JPanel test = new JPanel();

    JButton organicDog = new JButton("Create Organic Dog");
    JButton organicCat = new JButton("Create Organic Cat");
    JButton aiDogButton = new JButton("Create AiDog");
    JButton aiCatButton = new JButton("Create AiCat");
    JButton organicCatButton = new JButton("Create Organic Cat");
    JButton organicDogButton = new JButton("Create Organic Dog");

    JLabel createAiDogLabel = new JLabel();
    JLabel createAiCatLabel = new JLabel();
    JLabel createOrganicDogLabel = new JLabel();
    JLabel createOrganicCatLabel = new JLabel();

    ImageIcon dogIcon = new ImageIcon("/Users/6ix5ini/WCCI/GUI/GUI/src/cuteDog.jpg");
    ImageIcon roboDogIcon = new ImageIcon("/Users/6ix5ini/WCCI/GUI/GUI/src/RobotDog.jpg");
    ImageIcon robotCatIcon = new ImageIcon("/Users/6ix5ini/WCCI/GUI/GUI/src/RobotCat.jpg");
    ImageIcon catIcon = new ImageIcon("/Users/6ix5ini/WCCI/GUI/GUI/src/CuteCat.jpg");

    public GuiOne() {
        frame.pack();
        frame.setTitle("RoboticShelter");
        frame.setVisible(true);
        // Add the panel to the Frame
        frame.add(contentPane);
        // frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(1000, 1000);

        contentPane.setBorder(BorderFactory.createLineBorder(Color.RED));



    

        secondContentPane.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        contentPane.setOpaque(true);
        contentPane.add(organicCat);
        contentPane.add(secondContentPane);
         //Add first button to second panel
        secondContentPane.add(aiDogButton);
        aiDogButton.setBounds(100, 100, 500, 50);
        aiDogButton.add(new JLabel(roboDogIcon));
        aiDogButton.setOpaque(true);
        aiDogButton.setBackground(Color.BLACK);
        aiDogButton.addActionListener(this);
        createAiDogLabel.setBounds(200, 100, 100, 100);
        secondContentPane.add(createAiDogLabel);
        createAiDogLabel.setText(null);


        //Add second button to second panel
        secondContentPane.add(aiCatButton);
        // aiCatButton.setBounds(100, 200, 500, 50);
        aiCatButton.setOpaque(true);
        aiCatButton.setBackground(Color.DARK_GRAY);
        //aiCatButton.add(new JLabel(robotCatIcon));

        //Add third button to second  panel
        secondContentPane.add(organicCatButton);
        aiCatButton.setBounds(100, 200, 500, 50);
        organicCatButton.setOpaque(true);
        organicCatButton.setBackground(Color.DARK_GRAY);
        //organicCatButton.add(new JLabel(catIcon));

        //Add fourth button to panel
        secondContentPane.add(organicDogButton);
        organicDogButton.setOpaque(true);
        organicDogButton.setBackground(Color.GREEN);
        //organicDogButton.add(new JLabel(dogIcon));

        createAiCatLabel.setBounds(10, 10, 50, 50);

        organicCat.setIcon(catIcon);

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
