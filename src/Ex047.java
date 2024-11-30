import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex047 {
    public static void main(String[] args) {
        // Tratamento de Exceções
        // Eventos que ocorrem durante a execução de um programa que
        // Interrompem o fluxo normal do algoritmo
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro para ser dividido: ");
            int x = scanner.nextInt();

            System.out.printf("Digite um número inteiro para dividir %d por: ", x);
            int y = scanner.nextInt();

            // Se dividirmos por zero, cairemos em uma exceção aritmética (ArithmeticException)
            System.out.println("Resultado: " + (x / y));
        }
        catch (ArithmeticException e) {
                System.out.println("Você não pode dividir por zero, IDIOTA!");

        }
        catch (InputMismatchException e) {
            System.out.println("Você precisa digitar um número, CUZÃO!");
        }
        catch (Exception e) {
            System.out.println("Erro desconhecido, BABACA!");
        }
        finally {
            scanner.close();
            System.out.println("Isso vai sempre ser printado :)");
        }
    }
}
