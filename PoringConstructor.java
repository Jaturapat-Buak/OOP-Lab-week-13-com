
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PoringConstructor {

    private JFrame f;
    private JButton addButton;
    private Special2 sp;
    private ArrayList<poring> poringList = new ArrayList<>();

    public PoringConstructor() {
        f = new JFrame("Poring Constructor");
        f.setLayout(new FlowLayout());
        f.setSize(200, 100);

        addButton = new JButton("Add");
        f.add(addButton);

        addButton.addActionListener(e -> {
            poring p = new poring();
            poringList.add(p);
        });

        sp = new Special2(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addWindowListener(sp);

        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public JFrame getF() {
        return f;
    }

    public void setF(JFrame f) {
        this.f = f;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public void setAddButton(JButton addButton) {
        this.addButton = addButton;
    }

    public Special2 getSp() {
        return sp;
    }

    public void setSp(Special2 sp) {
        this.sp = sp;
    }

    public ArrayList<poring> getPoringList() {
        return poringList;
    }

    public void setPoringList(ArrayList<poring> poringList) {
        this.poringList = poringList;
    }
    
}
