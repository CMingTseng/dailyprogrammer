package dailyprogrammer.easy.challenge2.listener;

import java.awt.event.MouseEvent;

import javax.swing.JTextField;

public final class MouseListener implements java.awt.event.MouseListener {

    private JTextField textField;

    public MouseListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {

    }

    @Override
    public void mouseEntered(MouseEvent arg0) {

    }

    @Override
    public void mouseExited(MouseEvent arg0) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        textField.setText("");
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {

    }

}
