package Ex062;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeuFrame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;

    public MeuFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Enviar");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(new Color(0x00ff00));
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        textField.setText("Usuário");
        // textField.setEditable(false); // Desativa edição

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            String mensagem = textField.getText();
            System.out.println(mensagem);
            textField.setEditable(false); // Desativa a edição
            button.setEnabled(false); // Desativa o botão
        }
    }
}
