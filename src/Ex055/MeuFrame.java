package Ex055;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MeuFrame extends JFrame implements ActionListener {
    // Nosso frame vai ser uma classe filha/subclasse do Jframe, herdando tudo que tem nela
    // Vamos criar um construtor para essa classe

    // Declarando o objeto de botão de forma global (fora dos construtores)
    JButton botao;
    JLabel label;

    public MeuFrame() {

        // Criando o ícone
        ImageIcon icone = new ImageIcon("src/Ex054.png");
        ImageIcon icone2 = new ImageIcon("src/Ex053.png");

        label = new JLabel();
        label.setIcon(icone2);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setBounds(100, 200, 250, 250);
        label.setVisible(false);

        // Criando o botão (de forma global)
        botao = new JButton();
        // Definindo seu tamanho
        botao.setBounds(100, 100, 250, 100);
        // Precisamos da classe que irá implementar uma ação ao botão, "ouvindo" se ele foi clicado ou
        botao.addActionListener(this); // Passamos como parâmetro o "this" pelo fato da classe estar implementando a interface ActionListener
        // botao.addActionListener(e -> System.out.println("** Click **")); // Podemos utilizar uma expressão lambda que substitui o uso do @Override e da implementação para perfomar a escuta da ação dessa forma

        // Podemos estilizar esse botão!
        // Adicionando um texto
        botao.setText("Clique-me!");
        botao.setFocusable(false);
        botao.setIcon(icone);
        botao.setHorizontalTextPosition(JButton.CENTER);
        botao.setVerticalTextPosition(JButton.BOTTOM);
        botao.setFont(new Font("Comic Sans", Font.BOLD, 25));
        botao.setIconTextGap(-3);
        botao.setForeground(Color.BLACK);
        botao.setBackground(Color.lightGray);
        botao.setBorder(BorderFactory.createEtchedBorder());
        // botao.setEnabled(false); // Desativa o botão

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(botao);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Com esse método, nosso evento irá escutar a ação do botão e executar algo
        // Para verificar se o evento aconteceu no nosso botão, entramos com a seguinte condicional:
        if(e.getSource() == botao) {
            System.out.println("** Click **");
            label.setVisible(true);
            // botao.setEnabled(false); // Desativando o botão após um clique
        }
    }
}
