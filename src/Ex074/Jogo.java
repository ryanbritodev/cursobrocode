package Ex074;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Jogo {

    JFrame frame;
    JLabel label;

    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    public Jogo() {
        frame = new JFrame("Jogo KeyBinding");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100, 100, 100, 100);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new downAction();
        rightAction = new rightAction();
        leftAction = new leftAction();

        // label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        label.getInputMap().put(KeyStroke.getKeyStroke("W"), "upAction");
        label.getActionMap().put("upAction", upAction);
        // label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getInputMap().put(KeyStroke.getKeyStroke("S"), "downAction");
        label.getActionMap().put("downAction", downAction);
        // label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getInputMap().put(KeyStroke.getKeyStroke("A"), "leftAction");
        label.getActionMap().put("leftAction", leftAction);
        // label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label.getInputMap().put(KeyStroke.getKeyStroke("D"), "rightAction");
        label.getActionMap().put("rightAction", rightAction);

        frame.add(label);
        frame.setVisible(true);
    }

    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() - 10);
        }
    }

    public class leftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());
        }
    }

    public class downAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    public class rightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
        }
    }
}
