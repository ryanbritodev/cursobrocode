import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args){
        // Loops Aninhados
        // Basicamente, loops dentro de loops
        Scanner input = new Scanner(System.in);
        int linhas, colunas;
        String symbol = "";
        System.out.print("Entre uma quantidade # de linhas: ");
        linhas = input.nextInt();
        System.out.print("Entre uma quantidade # de colunas: ");
        colunas = input.nextInt();
        System.out.print("Entre com um símbolo: ");
        symbol = input.next();
        // Construindo dois loops. um para colunas e o outro para linhas
        for(int i = 1; i <= linhas; i++){
            System.out.println();
            for(int j = 1; j <= colunas; j++){
                System.out.print(symbol);
            }
        }
    }
}
