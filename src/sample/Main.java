package sample;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        NewJFrame newJFrame = new NewJFrame();
        newJFrame.setVisible(true);
        JLabel jLabel1 = newJFrame.getjLabel1();
        Thread t1 = new Thread(new ThreadForLabel(jLabel1, 100));
        t1.start();
        JLabel jLabel2 = newJFrame.getjLabel2();
        Thread t2 = new Thread(new ThreadForLabel(jLabel2, 1000));
        t2.start();
        JLabel jLabel3 = newJFrame.getjLabel3();
        Thread t3 = new Thread(new ThreadForLabel(jLabel3, 10000));
        t3.start();
        JButton jButton = newJFrame.getjButton1();
        jButton.addActionListener(e -> newJFrame.dispose());
    }
}
