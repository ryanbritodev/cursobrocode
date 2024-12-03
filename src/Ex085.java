import Ex085.*;

public class Ex085 {
    public static void main(String[] args) {

        // Expresões Lambda
        // Feature presente no Java 8 pra cima
        // Também conhecido como um método anônimo
        // Uma maneira mais curta de escrever classes anônimas com apenas com apenas um método

        // Precisa de uma interface funcional ou de uma interface pré definida
        // A interface deve conter apenas um método abstrato
        // ex. ActionListener, Runnable...

        // Uma expressão Lambda pode ser usada em quaisquer lugares que uma interface funcional for requerida
        // Como usar:
        // (argumentos) -> (bloco de código)

        // Uso Normal
        // MinhaInterface minhaInterface = new MinhaInterface() {
        // @Override
        // public void mensagem() {
        //
        //  }
        // };

        String nome = "Ryan";
        char simbolo = '!';

        // Uso com Lambda
        // () para parâmetros
        // {} para mais de um comando
        MinhaInterface minhaInterface = (Nome, Simbolo) -> {
            System.out.println("Olá Mundo!");
            System.out.println("Está uma bela noite, não é mesmo " + nome + "?");
            System.out.println("Espero que esteja bem" + simbolo);
        };

        MinhaInterface minhaInterface1 = (x, y) -> {
            System.out.println("Olá " + x + y);
        };

        minhaInterface.mensagem(nome, simbolo);
        System.out.println();
        minhaInterface1.mensagem(nome, simbolo);

    }
}
