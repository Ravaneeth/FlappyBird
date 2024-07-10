package com.example.flapybirds;

import javax.swing.*;




public class FlapyBirdsApplication {

    public static  void main(String[] args) throws Exception {
        int boarddWidth = 360;
        int boardheight =640;

        JFrame frame = new JFrame("Flappy bird");
        //frame.setVisible(true);
        frame.setSize(boarddWidth,boardheight);
        frame.setLocationRelativeTo(null); //keeps our window at the centre of the screen
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Flappy flappy = new Flappy();
        frame.add(flappy);
        frame.pack();
        flappy.requestFocus();
        frame.setVisible(true);

    }
    }


