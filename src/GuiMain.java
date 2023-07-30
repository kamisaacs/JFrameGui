import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GuiMain implements ActionListener{

    JFrame frame = new JFrame();
    JPanel mainPanel = new JPanel(new GridLayout(2, 1));
    JPanel tPanel = new JPanel(null);
    JPanel lPanel = new JPanel();


    JButton createPetButton = new JButton("Create Pet");
    JButton chooseTypeButton = new JButton("Choose Type");

    public GuiMain() {
        

        frame.pack();
        frame.setVisible(true);
        frame.add(mainPanel);
        mainPanel.add(tPanel);
        mainPanel.add(lPanel);
        frame.setTitle("Animal Shelter Amok");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        tPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 25));
        tPanel.setOpaque(true);
        lPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 50));


        tPanel.add(createPetButton);
        createPetButton.setBounds(400, 100, 550, 100);
        createPetButton.setBackground(Color.BLACK);
        createPetButton.addActionListener(this);
        // createPetButton.setOpaque(true);
        chooseTypeButton.setBackground(Color.BLACK);
        
    }


    public void makeLabel(){
        ImageIcon catIcon = new ImageIcon("/Users/6ix5ini/WCCI/GUI/GUI/src/CuteCat.jpg");

        // JLabel petIcon = new JLabel("I'm here");
        lPanel.add(new JLabel(catIcon));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("I'm working. But i am not positioned correctly");
        
        makeLabel();
        


        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}