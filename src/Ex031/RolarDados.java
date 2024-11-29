package Ex031;
import java.util.Random;


public class RolarDados {
    // Criando variáveis globais (dentro da classe)
    Random random = new Random();
    int numero;

    // Criando o Constructor
    public RolarDados(){
        // Criando uma instância da classe "random"
        // Random random = new Random(); // Variável do tipo Random local
        // int numero = 0; // Variável do tipo int local
        // rolar(random, numero); // Passando argumentos
        rolar();
    }

    // public void rolar(Random random, int numero) { // Passando argumentos
    public void rolar() {
        numero = random.nextInt(6)+1; // ... não pode ser acessada
        // Para resolvermos esse problema, podemos fazer de duas maneiras:
        // Ou passamos para o método rolar() o número e o random como argumento, ou definimos a variável número como global
        System.out.println(numero);
    }
}
