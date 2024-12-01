import Ex052.*;

public class Ex052 {
    public static void main(String[] args) {

        // JFrame = Uma interface gráfica (GUI) em que podemos adicionar componentes

        // Comentando e passando para classe pai
        /*
        JFrame frame = new JFrame(); // Cria um frame
        frame.setTitle("Janela com JFrame"); // Título
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sair da aplicação
        frame.setResizable(false); // Previne que nosso frame tenha seu tamanho ajustado
        frame.setSize(690, 690); // Eixo x / Eixo y
        frame.setVisible(true); // Torna o frame visível

        ImageIcon imagem = new ImageIcon("src/Ex052.png"); // Cria um ícone
        frame.setIconImage(imagem.getImage()); // Muda o ícone da janela
        frame.getContentPane().setBackground(new Color(0xe4336c)); // Cor de Fundo (RGB e Hex)
        */

        MeuFrame meuFrame = new MeuFrame();
        // ou (caso não for alterar e reutilizar os elementos)
        // new MeuFrame();
    }
}
