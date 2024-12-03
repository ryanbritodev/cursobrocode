package Ex065;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeuFrame extends JFrame implements ActionListener {

    JComboBox comboBox;

    public MeuFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // Podemos passar um array de opções para o menu de dropdown
        // Devemos usar classes wrapper (com letra capitalizada como Integer)
        String[] animais = {"Cachorro", "Gato", "Arara"};
        comboBox = new JComboBox(animais);
        comboBox.addActionListener(this);

        // Possibilita a edição do campo
        // comboBox.setEditable(true);
        // Quantidade de itens
        System.out.println(comboBox.getItemCount());
        // Adiciona ao dropdown
        comboBox.addItem("Cavalo");
        // Insere um item no index selecionado
        comboBox.insertItemAt("Porco", 0);
        // Seleciona em qual index ela começa
        comboBox.setSelectedIndex(0);
        // Remove um item
        comboBox.removeItem("Cachorro");
        // Remove pelo Index
        comboBox.removeItemAt(0);
        // Remove todos os itens
        // comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }
}
