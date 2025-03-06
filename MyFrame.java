import javax.swing.JFrame;

public class MyFrame {
    private JFrame f;
    private MyClock clock;
    private Thread t;

    public MyFrame() {
        f = new JFrame();
        clock = new MyClock();
        t = new Thread(clock);

        t.start();
        f.add(clock);

        f.setSize(1000, 1000);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }

}