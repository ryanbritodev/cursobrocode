package Ex094;

// Herda tudo da classe Thread e vamos sobrescrever (@Override) o método Run
public class MinhaThread extends Thread {

    @Override
    public void run(){
        System.out.println("Essa thread está rodando!");
    }

}
