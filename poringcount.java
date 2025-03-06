import java.awt.event.*;
import java.util.ArrayList;

public class poringcount implements ActionListener {
    private static int count = 0;
    private static ArrayList<poring> poringList = new ArrayList<>();

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        poring p = new poring();
        poringList.add(p);

        for (poring f : poringList) {
            f.getCountLabel().setText("Count: " + count);
        }
    }
}
