package Ex060;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AbrirPagina implements ActionListener {

    JFrame frame = new JFrame();
    JButton meuBotao = new JButton("Nova Página");

    public AbrirPagina() {

        meuBotao.setBounds(100, 160, 200, 40);
        meuBotao.setFocusable(false);
        meuBotao.addActionListener(this);

        frame.add(meuBotao);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == meuBotao) {
            //frame.dispose(); // Fecha a nossa antiga janela
            NovaPagina minhaJanela = new NovaPagina();
        }
    }
}
