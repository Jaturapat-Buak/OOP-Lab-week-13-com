
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
public class Special2 implements WindowListener {
    private PoringConstructor pr;
    public Special2(PoringConstructor pr){
        this.pr = pr;
    }
    @Override
    public void windowClosing(WindowEvent e) {
        List<poring> poringList = pr.getPoringList();
        for (poring p : poringList) {
            p.getF().dispose();
            }
        pr.getF().dispose();
    }
    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
}
