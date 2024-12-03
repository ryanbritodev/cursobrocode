import Ex080.*;

import java.util.Scanner;
import java.util.SortedMap;

public class Ex080 {
    public static void main(String[] args){

        // Exceções
        // Um evento que, após a execução do código, quebra a normalidade
        // ex. Exceção Artimética (dividir por zero), Index do Array fora de alcance

        // Exceções definidas pelo usuário
        // Exceções customizadas
        // ex. DuplicataEmail, CréditoInválido, ExceçãoIdade

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();

        try {
            checarIdade(idade);
        } catch (Exception e) {
            System.out.println("Um problema aconteceu: " + e);
        }

    }

    static void checarIdade(int idade) throws ExcecaoIdade {
        if(idade < 18) {
            throw new ExcecaoIdade("\nVocê deve ter 18 anos ou mais para inscrever-se :(");
        } else {
            System.out.println("Bem-vindo! :)");
        }
    }
}
