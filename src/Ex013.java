import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args){
        // Loop com While
        // Executa um bloco de código desde que a condição permaneça verdadeira
        // Parecido com o IF, mas continua aqule bloco de código até que a condição se torne falsa
        Scanner input = new Scanner(System.in);
        String nome = "";

        // Enquanto o campo de nome estiver vazio, ele continua pedindo uma entrada váldida para ser armazenada na variável
        while(nome.isBlank()) {
            System.out.print("Nome: ");
            nome = input.nextLine();
        }
        System.out.println("Olá, " + nome + "!");

        // Outra forma de utilizarmos é usando o "do", que primeiro executa o bloco de código que o preceede (pelo menos uma vez) e depois verifica a condição no final
        do {
            System.out.print("Nome: ");
            nome = input.nextLine();
        } while(nome.isBlank());

    }
}

