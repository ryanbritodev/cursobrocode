package Ex075;

import javax.swing.*;
import java.awt.*;

public class MeuFrame extends JFrame {

    MeuPainel painel;

    public MeuFrame() {
        painel = new MeuPainel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);

        this.add(painel);
        this.pack();

        this.setLocationRelativeTo(null); // aparece no meio da tela
        this.setVisible(true);
    }
}
