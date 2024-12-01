import javax.swing.*;
import java.awt.*;

public class Ex054 {
    public static void main(String[] args) {
        // JPanel
        // Um componente que funciona como um container para comportar outros componentes (janela menor)

        ImageIcon icon = new ImageIcon("src/Ex054.png");

        JLabel label = new JLabel();
        label.setText("Olá");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.CENTER); // TOP, BOTTOM, CENTER
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(100, 100, 75, 75); // É possível definir manualmente

        JPanel painel = new JPanel();
        painel.setBackground(Color.red);
        painel.setBounds(0, 0, 250, 250); // eixo x, y, largura e altura

        JPanel painelAzul = new JPanel();
        painelAzul.setBackground(Color.blue);
        painelAzul.setBounds(250, 0, 250, 250); // eixo x, y, largura e altura

        JPanel painelVerde = new JPanel();
        painelVerde.setBackground(Color.green);
        painelVerde.setBounds(0, 250, 500, 250); // eixo x, y, largura e altura
        painelVerde.setLayout(new BorderLayout());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Vamos colocar todos os elementos na mão
        frame.setSize(750, 750);
        frame.setVisible(true);

        // painel.add(label);
        // painelAzul.add(label);
        painelVerde.add(label);
        frame.add(painel);
        frame.add(painelAzul);
        frame.add(painelVerde);
    }
}
