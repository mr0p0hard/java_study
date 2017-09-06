package com.company;

import javax.swing.*;
import java.awt.*;

class HelloJava {

    public static void main( String[] args) {
	// write your code here
        JFrame frame = new JFrame("This is the title");
        JLabel label = new JLabel ("This is the text", JLabel.CENTER);
        frame.add(new HelloComponent());
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}

class HelloComponent extends JComponent{
    public void paintComponent (Graphics g) {
    g.drawString("Hello, Java!", 125, 95);
    }
}