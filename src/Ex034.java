import Ex034.*;

public class Ex034 {
    public static void main(String[] args) {
        // Array de Objetos em Java

        // Criando um array e definindo o tamanho
        // Comida[] geladeira = new Comida[3];

        Comida comida1 = new Comida("pizza");
        Comida comida2 = new Comida("hamburger");
        Comida comida3 = new Comida("hotdog");

        // geladeira[0] = comida1;
        // geladeira[1] = comida2;
        // geladeira[2] = comida3;

        // Forma mais prática ↓↓↓
        Comida[] geladeira = {comida1, comida2, comida3};

        // Retorna o espaço na memória onde esse array está armazenado
        // System.out.println(geladeira[0]);

        System.out.println(geladeira[0].nome);
        System.out.println(geladeira[1].nome);
        System.out.print(geladeira[2].nome);
    }
}
