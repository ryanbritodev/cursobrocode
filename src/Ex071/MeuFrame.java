package Ex071;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MeuFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    public MeuFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("src/Ex071.png");

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setIcon(icon);
        // label.setBackground(Color.red);
        // label.setOpaque(true);
        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {
        // Invoca quando uma tecla é digitada
        // Usa KeyChar (output de char)
        switch (e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-1, label.getY());
                break;
            case 'w': label.setLocation(label.getX(), label.getY()-1);
                break;
            case 's': label.setLocation(label.getX(), label.getY()+1);
                break;
            case 'd': label.setLocation(label.getX()+1, label.getY());
                break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Invoca quando uma tecla física é pressionada
        // Usa KeyCode (output de int)
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 5, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 5);
                break;
            case 39:
                label.setLocation(label.getX() + 5, label.getY());
                break;
            case 40:
                label.setLocation(label.getX(), label.getY()+ 5);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Chamada sempre que um botão é solto

        // Primeiro vamos ver o valor char da tecla que soltarmos
        System.out.println("Você soltou a tecla (keychar, char): " + e.getKeyChar());
        System.out.println("Você soltou a tecla (keycode, int): " + e.getKeyCode());
        System.out.println();
    }
}
