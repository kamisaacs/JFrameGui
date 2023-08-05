import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GuiMain implements ActionListener{

    JFrame frame = new JFrame();
    JPanel mainPanel = new JPanel(new GridLayout(2, 1));
    JPanel tPanel = new JPanel(new BorderLayout());
    JPanel lPanel = new JPanel(new GridLayout(1,1));
    // JPanel leftPanel = new JPanel(new BoxLayout(frame, 2));

    //Two main buttons on the panel
    JButton createPetButton = new JButton("Create Pet");
    JButton chooseTypeButton = new JButton("Choose Type");


    ImageIcon robotCatIcon = new ImageIcon("/Users/6ix5ini/WCCI/GUI/GUI/src/RobotCat.jpg");


    public ImageIcon getRobotCatIcon() {
        return robotCatIcon;
    }

    JRadioButton RoboKatRadioButton = new JRadioButton("RoboKat", robotCatIcon);
    ButtonGroup  group = new ButtonGroup();
   


    public GuiMain() {
        
        frame.pack();
        
        frame.setVisible(true);
        frame.add(mainPanel);
        frame.setTitle("Animal Shelter Amok");
        frame.setSize(750, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel.add(tPanel);
        mainPanel.add(lPanel);
        // mainPanel.add(leftPanel);
        
        

        tPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 25));
        tPanel.setOpaque(true);
        lPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 50));
        lPanel.setOpaque(true);
        group.add(RoboKatRadioButton);
        // leftPanel.setOpaque(true);
        // leftPanel.setVisible(true);


        


        tPanel.add(createPetButton,BorderLayout.NORTH);
        tPanel.add(chooseTypeButton,BorderLayout.SOUTH);
        chooseTypeButton.setBounds(100, 50, 100, 100);
        createPetButton.setBounds(400, 100, 550, 100);
        createPetButton.setBackground(Color.BLACK);
        createPetButton.addActionListener(this);
        // createPetButton.setOpaque(true);
        chooseTypeButton.setBackground(Color.BLACK);
        chooseTypeButton.addActionListener(this);

       
        
    }


    public void makeLabel(){
        ImageIcon catIcon = new ImageIcon("/Users/6ix5ini/WCCI/GUI/GUI/src/RoboDog1.JPG");

        // JLabel petIcon = new JLabel("I'm here");
        lPanel.add(new JLabel(catIcon));

    }

    public void makeRoboDog(){
        ImageIcon robotCatIcon = new ImageIcon("/Users/6ix5ini/WCCI/GUI/GUI/src/RobotCat.jpg");
        // lPanel.add(new JLabel(robotCatIcon));
        tPanel.add(new JLabel(robotCatIcon), BorderLayout.CENTER);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("I'm working. But i am not positioned correctly");
        
        if(e.getSource()== createPetButton){
            makeLabel();
            frame.pack();
        }

        if(e.getSource()== chooseTypeButton){
            makeRoboDog();
            frame.pack();
        }


        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}