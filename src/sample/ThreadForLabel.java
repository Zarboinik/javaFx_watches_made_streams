package sample;

import javax.swing.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ThreadForLabel implements Runnable {
    private JLabel jLabel;
    private  int timeout;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    public ThreadForLabel(JLabel jLabel, int timeout) {
        this.timeout = timeout;
        this.jLabel = jLabel;
    }

    @Override
    public void run() {
        while (true) {
            Calendar time = Calendar.getInstance();
            jLabel.setText(simpleDateFormat.format(time.getTime()));
            try {
                Thread.sleep(timeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
