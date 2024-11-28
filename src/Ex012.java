import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args){
        // Operadores lógicos em São usados para conectar duas ou mais expressões
        //        // && = (E) as duas condições devem ser verdadeiras
        //        // || = (OU) uma das condições deve ser verdadeira
        //        // ! = (NOT) caso nenhuma das condições forem verdadeirasJava
        //
        Scanner input = new Scanner(System.in);
        int temperatura = 25;

        if(temperatura > 30) {
            System.out.println("Está muito quente lá fora!");
        } else if(temperatura >= 20 && temperatura <= 30) { // Se a temperatura for maior que 20°C E, ao mesmo tempo, menor que 30°C, o caso será executado
            System.out.println("Está calor lá fora!");
        } else {
            System.out.println("Está frio lá fora!");
        }

        System.out.println("Você está jogando um jogo! Pressione q ou Q para sair");
        String resposta = input.next();

        if(resposta.equals("q") || resposta.equals("Q")) { // Se alguma das duas forem satisfeitas, irá mostrar o resultado encadeado
            System.out.println("Você saiu do jogo!");
        } else {
            System.out.println("Você ainda está jogando! *pew pew*");
        }

        // Revertendo o resultado do operador lógico
        if(!resposta.equals("q") && !resposta.equals("Q")) {
            System.out.println("Você ainda está jogando! *pew pew*");
        } else {
            System.out.println("Você saiu do jogo!");
        }
    }
}
