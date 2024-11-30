package Ex044;

// Implementando duas interfaces diferentes
public class Peixe implements Predador, Presa {
    @Override
    public void cacar() {
        System.out.println("**O Peixe tá caçando um peixe menor mermão!!!**");
    }

    @Override
    public void fugir() {
        System.out.println("**O Peixe tá fugindo do peixe maior carai!!!**");
    }
}
