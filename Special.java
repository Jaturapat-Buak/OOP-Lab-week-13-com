/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

import java.awt.event.*;
public class Special implements MouseListener {
    private poring p;
    public Special(poring p){
        this.p = p;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
            p.getF().dispose(); // ปิด JFrame เมื่อคลิกที่รูป
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
    
    }
}
