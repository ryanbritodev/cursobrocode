import java.util.Scanner;
import Ex046.*;

public class Ex046 {
    public static void main(String[] args) {
        // Polimorfismo Dinâmico em Java
        // Polimorfismo = muitas formas
        // Dinâmico = Depois da compilação (durante a execução)

        // ex. Um Corvette é um: Corvette, e um carro, e um veículo, e um objeto

        // Vamos declararum animal da classe animal e durante a execução do programa,
        // o usuário irá decidir se é um cachorro ou um gato
        // Vamos poder instânciar com um dos dois construtores
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("Que animal você quer?");
        System.out.println("Cachorro..........[1]");
        System.out.println("Gato..............[2]");

        while (true) {
            System.out.print("Número: ");
            int escolha = scanner.nextInt();
            if(escolha == 1) {
                animal = new Cachorro();
                animal.falar();
                break;
            } else if(escolha == 2) {
                animal = new Gato();
                animal.falar();
                break;
            } else {
                animal = new Animal();
                animal.falar();
                System.out.println("Opção inválida!");
            }
        }
    }
}
