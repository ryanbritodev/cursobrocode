package Ex044;

public class Coelho implements Presa {
    // Para implementarmos uma interface, podemos usar a palavra "implements"
    // Precisamos definir o que aquele método irá fazer, sobrescrevendo ele com @Override
    @Override
    public void fugir() {
        System.out.println("**O Coelho tá fugindo rapaz!!!**");
    }
}
