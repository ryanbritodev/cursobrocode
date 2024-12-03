package Ex073;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MeuFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;
    ImageIcon dizzy;

    public MeuFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 800);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        smile = new ImageIcon("src/Ex073a.png");
        nervous = new ImageIcon("src/Ex073b.png");
        pain = new ImageIcon("src/Ex073c.png");
        dizzy = new ImageIcon("src/Ex073d.png");

        label.setIcon(smile);

        this.add(label);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setIcon(pain);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(dizzy);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(nervous);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(smile);
    }
}
