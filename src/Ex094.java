import Ex094.*;

public class Ex094 {
    public static void main(String[] args) throws InterruptedException {

        // Threads (Encadeamento de Execução)

        // Uma Thread é basicamente uma cadeia de execução em um programa (como uma CPU virtual)
        // O JVM do Java permite uma aplicação ter múltiplas threads rodando ao mesmo tempo
        // Cada uma é capaz de executar partes do seu código em paralelo com a thread principal
        // Cada uma tem sua prioridade (1/10)
        // As com maior prioridade são executadas com preferência

        // O Java Virtual Machine (JVM) continua executando threads até que uma dessas coisas aconteça:
        // 1. O método de saída de uma classe (Runtime) for chamado
        // 2. Todas as threads do usuário forem removidas/matadas

        // Quando o JVM começa, tem uma thread que chama o método principal (main)
        // Ela (thread) É chamada de "main"

        // Método para validar quantas estão ativas
        System.out.println(Thread.activeCount());

        // Renomeando o nome da Thread
        // Thread.currentThread().setName("Mano Brown");

        // Método para retornar o nome da Thread atual (main)
        System.out.println(Thread.currentThread().getName());

        // Redefinir a prioridade da Thread
        // Thread.currentThread().setPriority(10);

        // Como checar a prioridade das Threads (escala de 1 a 10)
        System.out.println(Thread.currentThread().getPriority());

        // Como ver se ela está "viva" (rodando)
        System.out.println(Thread.currentThread().isAlive()); // Booleano

        System.out.println();

        // Sleep de Thread
        for(int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Acabou!");

        System.out.println();

        // Criando uma nova Thread
        MinhaThread thread2 = new MinhaThread();

       // Iniciando a Thread
        thread2.start(); // ou run() porém start() é melhor

        System.out.println(thread2.isAlive()); // Retorna falso caso não for iniciada

        thread2.setName("2ª Thread");
        System.out.println(thread2.getName());
        thread2.setPriority(1); // Definindo a prioridade
        System.out.println(thread2.getPriority()); // Prioridade dela, herdada pela Thread que criou ela (main)

        System.out.print("Thread Ativas: ");
        System.out.println(Thread.activeCount());

        // Tipos diferentes de Thread

        // Daemon Thread:
        // Thread que roda no fundo com prioridade baixa, executando tarefas como a coleta de lixo

        // O JVM mata o processo dele mesmo quando todas as Threads do usuário (threads não daemon) terminam sua execução

        System.out.println();

        // Verificando se é Daemon e setando seu estado

        // thread2.setDaemon(true);
        System.out.println(thread2.isDaemon());

    }
}
