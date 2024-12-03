package Ex085;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeuFrame extends JFrame {
    JButton meuBotao = new JButton("MEU BOTÃO #1");
    JButton meuBotao1 = new JButton("MEU BOTÃO #2");

    public MeuFrame() {

        meuBotao.setBounds(100, 100, 200, 100);
        meuBotao1.setBounds(100, 200, 200, 100);

        // Método Antigo
        //        meuBotao.addActionListener(new ActionListener() {
        //            @Override
        //            public void actionPerformed(ActionEvent e) {
        //
        //            }
        //        });

        meuBotao.addActionListener((e) -> System.out.println("Você clicou no botão #1!"));
        meuBotao1.addActionListener((e) -> System.out.println("Você clicou no botão #2!"));

        this.add(meuBotao);
        this.add(meuBotao1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);
    }
}
