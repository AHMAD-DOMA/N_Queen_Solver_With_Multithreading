/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstScreenGUI;

import static FirstScreenGUI.input.CAN_STOP;
import static FirstScreenGUI.input.N;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmad
 */
public class KeyListener1 implements KeyListener {

    public javax.swing.JTextField input;
    public JFrame frame;

    KeyListener1(javax.swing.JTextField input, JFrame frame) {
        this.input = input;
        this.frame = frame;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        int n = 0;
        if (e.getKeyChar() == KeyEvent.VK_ENTER) {
            String inputx = input.getText();
            try {
                n = Integer.parseInt(inputx);
            } catch (Exception ex) {
            }
            if (!(n == (int) n) || n < 4) {
                //System.out.println("You should enter an integer number starting from 4".toUpperCase());
                JOptionPane.showMessageDialog(frame, "You should enter an integer number starting from 4".toUpperCase());
                this.input.setText("");
            } else {
                N = n;
                CAN_STOP = true;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
