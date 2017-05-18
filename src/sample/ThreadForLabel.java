package sample;

import javax.swing.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ThreadForLabel implements Runnable {
    JLabel jLabel = new JLabel();

    public ThreadForLabel(JLabel jLabel) {
        this.jLabel = jLabel;
    }

    @Override
    public void run() {
        while (true) {
            Calendar time = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            jLabel.setText(simpleDateFormat.format(time.getTime()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
