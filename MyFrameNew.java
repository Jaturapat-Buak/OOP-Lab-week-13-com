/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import javax.swing.JFrame;
public class MyFrameNew {
    private JFrame f;
    private MyClockNew clock;
    private Thread t;
    private EventHandling e;
    
    public MyFrameNew() {
        f = new JFrame();
        clock = new MyClockNew();
        t = new Thread(clock);
        e = new EventHandling(clock);
        
        t.start();
        f.add(clock);
        
        f.addMouseListener(e);
        f.setSize(10000, 10000);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);  
    }
}
