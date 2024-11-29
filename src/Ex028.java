public class Ex028 {
    public static void main(String[] args) {
        // Final no Java
        // Qualquer coisa que for declara como "final", não pode ser alterada posteriormente no seu programa

        // Declaramos a variável pi
        double pi = 3.14159;

        // Substituindo o valor alocado na memória
        pi = 4;

        System.out.println(pi);

        final double altura = 1.55;

        // Não funciona, pois o valor é se tornou imutável
        // altura = 1.85;

        System.out.println(altura);
    }
}
