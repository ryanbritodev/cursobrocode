import javax.swing.JOptionPane;

public class Ex006 {
    public static void main(String[] args){
        // Informações do Usuário em uma caixa de diálogo
        String nome = JOptionPane.showInputDialog("Qual seu nome?");
        JOptionPane.showMessageDialog(null, "Olá " + nome + "!");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
        JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos!");
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua altura?"));
        JOptionPane.showMessageDialog(null, "Você tem " + altura + "cm de altura!");
    }
}
