package Ex095;

public class MinhaThread extends Thread {
    @Override
    public void run() {
        for(int i = 10; i > 0; i--){
            System.out.println("Thread #1 : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // System.out.println(3/0);
            // Mesmo causando uma exceção, como dividir por 0, nosso programa principal irá continuar rodando
        }
        System.out.println("Thread #1 finalizada com sucesso!");
    }
}
