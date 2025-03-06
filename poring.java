import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class poring {
    private JFrame f;
    private JLabel lb, countLabel;
    private Special sp;
    private static int count = 0;

    public poring() {
        f = new JFrame();
        f.setLayout(new BorderLayout());
        f.setSize(100, 120);


        String url = "poring.png";
        ImageIcon img = new ImageIcon(url);
        lb = new JLabel(img);
        
        sp = new Special(this);
        lb.addMouseListener(sp);
        
        countLabel = new JLabel("" + (++count), SwingConstants.CENTER);

        f.add(countLabel, BorderLayout.SOUTH);
        f.add(lb, BorderLayout.CENTER);

        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setResizable(false);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public JFrame getF() {
        return f;
    }

    public JLabel getCountLabel() {
        return countLabel;
    }

    public static int getCount() {
        return count;
    }

    public static void updateCount(int newCount) {
        count = newCount;
    }
}
