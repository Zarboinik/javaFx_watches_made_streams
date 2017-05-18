package sample;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame("Multithreading");
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setSize(400, 300);
        myWindow.setVisible(true);
        JPanel panel = new JPanel();
        JLabel jLabel1 = new JLabel();
        Thread t1 = new Thread(new ThreadForLabel(jLabel1));
        t1.start();
        panel.setLayout(new FlowLayout());
        panel.add(jLabel1);
        JLabel jLabel2 = new JLabel();
        Thread t2 = new Thread(new ThreadForLabel2(jLabel2));
        t2.start();
        panel.add(jLabel2);
        myWindow.setContentPane(panel);
    }
}
