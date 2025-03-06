/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.*;
import javax.swing.*;
public class MyClockNew extends JLabel implements Runnable {
    private int sec;
    private int min;
    private int hour;
    private boolean resume = true;

    public synchronized void continueTime() {
        resume = !resume;
        if (resume) {
            System.out.println("Resume");
            notifyAll();
        } else {
            System.out.println("pause");
        }
    }
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                while (!resume) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        setFont(new Font("Times New Roman", Font.PLAIN, 120));    
        setHorizontalAlignment(SwingConstants.CENTER);
        setText(String.format("%02d:%02d:%02d", hour, min, sec));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            }

        sec++;
        if (sec > 59) {
            min++;
                sec = 0;
        } else if (min > 59) {
            hour++;
            min = 0;
        }
    }

}
}
