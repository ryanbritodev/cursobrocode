package Ex052;

import javax.swing.*;
import java.awt.*;

public class MeuFrame extends JFrame {
    // Criando um Constructor do Frame
    public MeuFrame() {
        JFrame frame = new JFrame(); // Cria um frame
        frame.setTitle("Janela com JFrame"); // Título
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sair da aplicação
        frame.setResizable(false); // Previne que nosso frame tenha seu tamanho ajustado
        frame.setSize(690, 690); // Eixo x / Eixo y
        frame.setVisible(true); // Torna o frame visível

        ImageIcon imagem = new ImageIcon("src/Ex052.png"); // Cria um ícone
        frame.setIconImage(imagem.getImage()); // Muda o ícone da janela
        frame.getContentPane().setBackground(new Color(0xe4336c)); // Cor de Fundo (RGB e Hex)
    }
}
