import Ex090.*;

public class Ex090 {
    public static void main(String[] args) {

        // Bounded Types
        // Você pode criar os objetos de uma classe genérica para obter dados derivados específicos
        // ex. Number

        MinhaClasseGenerica<Integer, Integer> meuInt = new MinhaClasseGenerica<>(1, 9);
        MinhaClasseGenerica<Double, Double> meuDouble = new MinhaClasseGenerica<>(3.14, 1.02);
        // MinhaClasseGenerica<Character, Character> meuChar = new MinhaClasseGenerica<>('@', '$'); // Não podemos, não está incluído na classe Number
        // MinhaClasseGenerica<String, Character> minhaString = new MinhaClasseGenerica<>("Olá Mundo!", '!'); // Não podemos, não está incluído na classe Number

        System.out.println(meuInt.getValor());
        System.out.println(meuDouble.getValor());
        // System.out.println(meuChar.getValor());
        // System.out.println(minhaString.getValor());

    }
}
