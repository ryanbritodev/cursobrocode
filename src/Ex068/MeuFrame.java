package Ex068;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MeuFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu helpMenu;
    JMenu editMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    public MeuFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("src/Ex068a.png");
        saveIcon = new ImageIcon("src/Ex068b.png");
        exitIcon = new ImageIcon("src/Ex068c.png");

        menuBar = new JMenuBar();

        // Adicionamos, não precisa setar
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        // Criando atalhos de teclado
        fileMenu.setMnemonic(KeyEvent.VK_F); // alt + f = menu file
        editMenu.setMnemonic(KeyEvent.VK_E); // alt + e = menu edit
        helpMenu.setMnemonic(KeyEvent.VK_H); // alt + h = menu help
        loadItem.setMnemonic(KeyEvent.VK_L); // L = Load
        saveItem.setMnemonic(KeyEvent.VK_S); // S = Save
        exitItem.setMnemonic(KeyEvent.VK_E); // E = Load

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loadItem) {
            System.out.println("** beep boop ** você carregou um arquivo!");
        }
        if(e.getSource() == saveItem) {
            System.out.println("** beep boop ** você salvou um arquivo!");
        }
        if(e.getSource() == exitItem) {
            System.out.println("** saindo ** até mais!");
            System.exit(0);
        }

    }
}
