import Ex095.*;

public class Ex095 {
    public static void main(String[] args) {

        // MultiThreading
        // Processo de executar múltiplas threads simultaneamente
        // Auxilia na utilização máxima de CPU
        // Threads são independentes, elas não afetam a execução de outras Threads
        // Um exceção que acontecer em uma Thread não vai interromper as outras
        // Útil para servir múltiplos clientes, jogos multiplayer e outros processos que precisam ocorrer de forma simultânea

        MinhaThread thread = new MinhaThread();

        // Criando uma instância de uma classe que está implementando a interface Runnable e criando um Thread (passando ela como argumento)
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);

        thread.start();
        // thread.join(3000); // espera um intervalo específico
        thread1.start();

        // As duas rodam independetemente, ao mesmo tempo

    }
}
