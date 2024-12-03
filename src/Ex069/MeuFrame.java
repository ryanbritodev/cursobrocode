package Ex069;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MeuFrame extends JFrame implements ActionListener {

    JButton button;

    public MeuFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Selecione um arquivo...");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {

            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File(".")); // Pasta do Projeto

            // int resposta = fileChooser.showOpenDialog(null); // Seleciona um arquivo para abrir, retorna 0 se escolhermos um arquivo e 1 se fecharmos/cancelarmos
            int resposta = fileChooser.showSaveDialog(null); // Seleciona um arquivo para abrir

            if(resposta == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }

        }
    }
}
