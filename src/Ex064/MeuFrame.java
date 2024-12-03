package Ex064;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeuFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;
    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotdogIcon;

    public MeuFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaIcon = Redimensionar.redimensionar("src/Ex064c.png", 50, 50);
        hamburgerIcon = Redimensionar.redimensionar("src/Ex064a.png", 50, 50);
        hotdogIcon = Redimensionar.redimensionar("src/Ex064b.png", 50, 50);

        // Apenas criando os botões e não atribuindo eles em um grupo nos deixa selecionar todos
        pizzaButton = new JRadioButton("Pizza");
        hamburgerButton = new JRadioButton("Hamburger");
        hotdogButton = new JRadioButton("Hotdog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);


        // Adicionando os Actions Listeners
        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pizzaButton) {
            System.out.println("Você pediu pizza!");
        } else if (e.getSource() == hamburgerButton) {
            System.out.println("Você pediu hamburguer!");
        } else if (e.getSource() == hotdogButton) {
            System.out.println("Você escolheu hotdog!");
        }
    }
}
