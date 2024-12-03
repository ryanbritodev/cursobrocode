import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Ex081 {
    public static void main(String[] args) {

        // Objetos Anônimos
        JFrame frame = new JFrame();
        ArrayList<JLabel> deckCartas = new ArrayList<JLabel>();

        // Seria preciso fazer isso várias e várias vezes...
        // ImageIcon AC = new ImageIcon("src\\cards\\1.png");
        // JLabel AClabel = new JLabel(AC);
        // deckCartas.add(AClabel);

        // Jeito mais compacto (objeto sem nomeação)

        for(int i = 1; i<=60; i++) {
            deckCartas.add(new JLabel(new ImageIcon("src\\Ex081\\" + i + ".png")));
            frame.add(deckCartas.get(i-1));
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }
}
