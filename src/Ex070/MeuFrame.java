package Ex070;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeuFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    public MeuFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Escolha uma cor!");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("Isso é um pouco de texto :D");
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Escolha uma cor...", Color.black);
            label.setForeground(color);
            // label.setBackground(color);
        }
    }
}
