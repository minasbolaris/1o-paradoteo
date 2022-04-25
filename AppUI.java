package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppUI extends Main implements ActionListener {
    JButton Appbutton1= new JButton("LOGIN");
    JFrame app = new JFrame();

    AppUI() {
        //LABELS
        Border border = BorderFactory.createLineBorder(Color.CYAN);
        JLabel AppLabel = new JLabel();
        AppLabel.setText("WELCOME TO OUR APP");
        ImageIcon image = new ImageIcon("parking logo.png");
        AppLabel.setIcon(image);
        AppLabel.setHorizontalTextPosition(JLabel.CENTER);
        AppLabel.setVerticalTextPosition(JLabel.TOP);
        AppLabel.setForeground(Color.red);
        AppLabel.setFont(new Font("Mv Boli", Font.PLAIN, 20));
        AppLabel.setBackground(Color.black);
        AppLabel.setOpaque(true);
        AppLabel.setBorder(border);
        AppLabel.setVerticalAlignment(JLabel.TOP);
        AppLabel.setHorizontalAlignment(JLabel.CENTER);
        AppLabel.setBounds(0,0,1500,1500);

        //BUTTON LOGIN
        JButton Appbutton1= new JButton();
        Appbutton1.setBounds(600,200,250,50);
        Appbutton1.setText("LOGIN");
        Appbutton1.addActionListener(this);
        Appbutton1.setFocusable(true);
        Appbutton1.setVisible(true);
        Appbutton1.setHorizontalTextPosition(JLabel.CENTER);
        Appbutton1.setVerticalAlignment(JLabel.CENTER);
        Appbutton1.setBackground(Color.red);

        //BUTTON SIGN IN
        JButton Appbutton2= new JButton();
        Appbutton2.setBounds(600,270,250,50);
        Appbutton2.setText("SIGN UP");
        Appbutton2.addActionListener(this);
        Appbutton2.setFocusable(true);
        Appbutton2.setVisible(true);
        Appbutton2.setHorizontalTextPosition(JLabel.CENTER);
        Appbutton2.setVerticalAlignment(JLabel.CENTER);
        Appbutton2.setBackground(Color.red);




        //FRAMES
        JFrame app = new JFrame();
        app.setTitle("Parking"); //name of our this
        app.setSize(420, 420);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setResizable(true);
        app.setLayout(null);
        app.setVisible(true);
        app.add(AppLabel);
        app.add(Appbutton1);
        app.add(Appbutton2);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.getContentPane().setLayout(null);
        app.getContentPane().add(Appbutton1);


        //LOGO
        ImageIcon logo = new ImageIcon("parking logo.png");
        app.setIconImage(logo.getImage());
        app.getContentPane().setBackground(Color.lightGray);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        app.setVisible(true);
        app.dispose();
        Registration registration = new Registration();



    }
}




