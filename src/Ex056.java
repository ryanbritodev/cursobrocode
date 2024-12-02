import javax.swing.*;
import java.awt.*;

public class Ex056 {
    public static void main(String[] args) {
        // Gerenciador de Layout
        // Define o layout natural para os componentes dentro de um container

        // 3 gerenciadores mais comuns

        // Border Layout
        // Um Border Layout coloca componentes em 5 áreas diferentes: NORTE, SUL, OESTE, LESTE, CENTRO
        // Todos os espaços extras são colocados na Área Central

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        // frame.setLayout(new BorderLayout(10, 10)); // Definindo margens entre os painéis, verticalmente e horizontalmente
        frame.setVisible(true);

        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        JPanel painel3 = new JPanel();
        JPanel painel4 = new JPanel();
        JPanel painel5 = new JPanel();

        painel1.setBackground(Color.red);
        painel2.setBackground(Color.green);
        painel3.setBackground(Color.yellow);
        painel4.setBackground(Color.magenta);
        painel5.setBackground(Color.blue);

        painel1.setPreferredSize(new Dimension(100, 100));
        painel2.setPreferredSize(new Dimension(100, 100));
        painel3.setPreferredSize(new Dimension(100, 100));
        painel4.setPreferredSize(new Dimension(100, 100));
        painel5.setPreferredSize(new Dimension(100, 100));

        // Sub-Painéis
        JPanel painel6 = new JPanel();
        JPanel painel7 = new JPanel();
        JPanel painel8 = new JPanel();
        JPanel painel9 = new JPanel();
        JPanel painel10 = new JPanel();

        painel6.setBackground(Color.black);
        painel7.setBackground(Color.darkGray);
        painel8.setBackground(Color.gray);
        painel9.setBackground(Color.lightGray);
        painel10.setBackground(Color.white);

        painel5.setLayout(new BorderLayout());

        painel6.setPreferredSize(new Dimension(100, 100));
        painel7.setPreferredSize(new Dimension(100, 100));
        painel8.setPreferredSize(new Dimension(100, 100));
        painel9.setPreferredSize(new Dimension(100, 100));
        painel10.setPreferredSize(new Dimension(100, 100));

        painel5.add(painel6, BorderLayout.NORTH);
        painel5.add(painel7, BorderLayout.SOUTH);
        painel5.add(painel8, BorderLayout.WEST);
        painel5.add(painel9, BorderLayout.EAST);
        painel5.add(painel10, BorderLayout.CENTER);

        frame.add(painel1, BorderLayout.NORTH);
        frame.add(painel2, BorderLayout.WEST);
        frame.add(painel3, BorderLayout.EAST);
        frame.add(painel4, BorderLayout.SOUTH);
        frame.add(painel5, BorderLayout.CENTER);

    }
}
