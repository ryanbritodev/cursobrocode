package Ex072;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MeuFrame extends JFrame implements MouseListener {

    JLabel label;

   public MeuFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this); // Como estamos implementando, só passamos o this
        // this.addMouseListener(this); // Aqui, fazemos para o frame inteiro

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       // Invocado quando um botão do mouse foi clickado (pressionado e depois solto) em um componente
        System.out.println("Você clicou!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invocado quando um botão do mouse é pressionado sobre um componente
        System.out.println("Você pressionou!");
        label.setBackground(Color.yellow);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       // Invocado quando um botão do mouse solta o componente
        System.out.println("Você soltou!");
        label.setBackground(Color.green);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       // Invocado quando o mouse passa por cima de um componente (estando em cima dele)

        System.out.println("Você entrou!");
        label.setBackground(Color.blue);
    }

    @Override
    public void mouseExited(MouseEvent e) {
       // Invocado quando saímos do componente (onde o mouse estava
        System.out.println("Você saiu! :(");
        label.setBackground(Color.red);

    }
}
