import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Ex053 {
    public static void main(String[] args) {
        // JLabel
        // Um display de interface gráfica que mostra uma área de texto, imagem ou os dois

        ImageIcon image = new ImageIcon("src/Ex053.png");
        Border borda = BorderFactory.createLineBorder(new Color(0xe60023));

        JLabel label = new JLabel(); // Cria uma label
        label.setText("Bem-vindo(a) ao Java! :)"); // Adiciona o texto a label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // Colocar o texto a ESQUERDA, CENTRO ou DIREITA do imageicon
        label.setVerticalTextPosition(JLabel.TOP); // Colocar o texto no TOPO, CENTRO ou ABAIZO do imageicon
        label.setForeground(new Color(0xe60023)); // Adiciona a cor da fonte do texto
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // Adiciona a fonte do texto
        label.setIconTextGap(-10); // Adiciona ou diminui o gap (espaço) entre a imagem e o texto
        label.setBackground(Color.black); // Adiciona um cor de fundo a label
        label.setOpaque(true); // Mostra o fundo
        label.setBorder(borda);
        label.setVerticalAlignment(JLabel.CENTER); // Centraliza a label verticalmente
        label.setHorizontalAlignment(JLabel.CENTER); // Centraliza a label horizontalmente
        // label.setBounds(100, 100, 350, 350); // Define a posição x e y assim como suas dimensões

        JFrame frame = new JFrame(); // Cria um frame
        frame.setTitle("Janela com JFrame"); // Título
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sair da aplicação
        frame.setResizable(true); // Previne que nosso frame tenha seu tamanho ajustado
        frame.setSize(500, 500); // Eixo x / Eixo y
        // frame.setLayout(null); // Tipo de Layout
        frame.setVisible(true); // Torna o frame visível

        ImageIcon imagem = new ImageIcon("src/Ex053.png"); // Cria um ícone
        frame.setIconImage(imagem.getImage()); // Muda o ícone da janela
        frame.add(label);
        // frame.pack(); // Ajusta o tamanho para caber todos os elementos/labels
    }
}
