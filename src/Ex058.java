import javax.swing.*;
import java.awt.*;

public class Ex058 {
    public static void main(String[] args) {

        // Grid Layout

        // Coloca componentes em um grade de células
        // Cada componente pega todo seu espaço disponível na célula
        // e cada célula possui tamanho igual

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        // Linhas e Colunas, Margem
        frame.setLayout(new GridLayout(3, 3, 10, 10));

        // JButton botao1 = new JButton("1");
        // frame.add(botao1);

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        // Ele cria uma nova coluna por não conseguir portar todos eles no número de colunas
        // frame.add(new JButton("10"));

        frame.setVisible(true);

    }
}
