import javax.swing.*;
import java.awt.*;
import java.io.FileReader;

public class Ex059 {
    public static void main(String[] args) {

        // JLayeredPane

        // Swing container que prove uma terceira dimensão no posicionamento de componentes
        // Ex: Profundidade, Z-index

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150, 150, 200, 200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);

        // Método Convencional
        // layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER); // Camada do Fundo (DEFAULT)
        // layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER); // Camada do Fundo (DEFAULT)
        // layeredPane.add(label3, JLayeredPane.DRAG_LAYER); // Camada de Cima (DRAG)

        // Método mais rápido, numerando qual é o número da camada
        layeredPane.add(label1, Integer.valueOf(0)); // Camada do Fundo (0)
        layeredPane.add(label2, Integer.valueOf(2)); // Camada de Cima (2)
        layeredPane.add(label3, Integer.valueOf(1)); // Camada do Meio (1)

        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null); // importante
        frame.setVisible(true);



    }
}
