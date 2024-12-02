import javax.swing.*;
import java.awt.*;

public class Ex061 {
    public static void main(String[] args) {
        // JOptionPane
        // Pop Up que mostra uma caixa de diálogo que pergunta ao usuário um valor ou informa sobre algo

        JOptionPane.showMessageDialog(null, "Hello World!", "Mensagem com JOptionPane", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello World!", "Mensagem com JOptionPane", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello World!", "Mensagem com JOptionPane", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello World!", "Mensagem com JOptionPane", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello World!", "Mensagem com JOptionPane", JOptionPane.ERROR_MESSAGE);

        // Pra irritar os amigos, kk
        // while(true) {
        //    JOptionPane.showMessageDialog(null, "Seu computador está com um VÍRUS!!!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        // }

        System.out.println(JOptionPane.showConfirmDialog(null, "Você coda marmanjo?", "EAI???", JOptionPane.YES_NO_CANCEL_OPTION));

        // Tabela de Retorno
        // 0.............SIM
        // 1.............NÃO
        // 2........CANCELAR
        // -1.........FECHAR

        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        System.out.printf("Olá, %s!", nome);

        String[] respostas = {"Não, você é legal!", "Obrigado", "**eita**"};

        ImageIcon icone = new ImageIcon("src/Ex052.png");

        // Redimensionando a Imagem
        Image imagem = icone.getImage();
        Image novaImagem = imagem.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        icone = new ImageIcon(novaImagem);

        JOptionPane.showOptionDialog(null, "Você é legal!", "Mensagem Secreta", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icone, respostas, 0);
    }
}
