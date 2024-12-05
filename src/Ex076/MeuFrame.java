package Ex076;

import javax.swing.*;

public class MeuFrame extends JFrame {

    MeuPainel painel;

    public MeuFrame() {

        painel = new MeuPainel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(painel);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
