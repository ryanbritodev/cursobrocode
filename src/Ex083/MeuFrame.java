package Ex083;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeuFrame extends JFrame {

    JButton button = new JButton("Botão #1");
    JButton button2 = new JButton("Botão #2");
    JButton button3 = new JButton("Botão #3");

    public MeuFrame() {
        button.setBounds(100, 100, 100, 100);
        button2.setBounds(200, 100, 100, 100);
        button3.setBounds(300, 100, 100, 100);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Você pressionou o Botão #1");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Você pressionou o Botão #2");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Você pressionou o Botão #3");
            }
        });

        this.add(button);
        this.add(button2);
        this.add(button3);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
    }
}
