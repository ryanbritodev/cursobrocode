import javax.swing.*;
import java.awt.*;

public class Ex057 {
    public static void main(String[] args) {
        // FlowLayout
        // Coloca os componentes em linhas, dimensionados da maneira que preferirem
        // Se o espaço horizontal no container for muito pequeno,
        // o FlowLayout usa a próxima coluna disponível

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        // Por padrão, os frames utilizam o BorderLayout
        // Podemos adicionar margens (horinzotal e vertical)
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // leading = esquerda, center = centro (padrão), trailing = direita

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        // Como criar um botão de forma mais direta
        // JButton botao1 = new JButton(); ❌
        panel.add(new JButton("1")); // ✅
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
