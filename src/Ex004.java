import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args){
        // Pegando inputs do usuário com Scanner
        // Criando um novo Scanner com o nome "input"
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        String name = input.nextLine();
        System.out.println("Qual a sua idade? ");
        int idade = input.nextInt();
        input.nextLine();
        System.out.println("Qual a sua comida favorita?");
        String comida = input.nextLine();
        System.out.println("Muito prazer em te conhecer, " + name + "!");
        System.out.println("Que legal! Você tem " + idade + " anos de idade");
        // O método next sempre irá chamar uma sequência de escape para pularmos de linha (\n)
        // Devemos limpar o \n do Scanner, para não ocorrer o problema de pular o input abaixo por ter chamado o nextInt
        // Para limparmos, podemos chamar o input.nextLine(); logo após ler o valor numérico
        System.out.println("Sua comida favorita é " + comida);
        // Caso entremos com um valor diferente do que um inteiro, ocorrerá uma exceção de InputMismatchException
        // Iremos tratar ela mais pra frente
    }
}
