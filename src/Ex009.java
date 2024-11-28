import java.util.Random;

public class Ex009 {
    public static void main(String[] args){
        // Gerando números aleatórios com Java
        // Instância da classe Random
        Random numeroAleatorio = new Random();
        // Pseudo Random Numbers
        // Não são totalmente randômicos
        // Se não passarmos uma bound, ele vai gerar um número entre -2 bilhões e 2 bilhões
        int x = numeroAleatorio.nextInt(6)+1; // Valor random entre 1 e 6
        double y = numeroAleatorio.nextDouble();
        boolean z = numeroAleatorio.nextBoolean();
        System.out.println("Número Inteiro Aleatório: " + x);
        System.out.println("Número Flutuante Aleatório: " + y);
        System.out.println("Booleano Aleatório: " + z);
    }
}
