import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args){
        // Condicionais e Comparadores
        // ==, >, <, >=, <=, !=
        // if = executa um bloco de código se aquela condição for verdadeira
        Scanner input = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int age = input.nextInt();
        if (age >= 75) {
            System.out.println("Você é um véio! Ok, boomer");
        } else if (age >= 18) {
            System.out.println("Você é um adulto!");
        } else if (age >= 13) {
            System.out.println("Você é um adolescente!");
        } else {
            System.out.println("Você não é um adulto!");
        }
    }
}
