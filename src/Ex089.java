import Ex089.*;

import java.util.HashMap;

public class Ex089 {
    public static void main(String[] args) {


        // Classes Genéricas
        // Vamos mandar esses valores para os construtores das classes

        // Jeito Tradicional (criando classes individuais)
        // MinhaClasseInt meuInt = new MinhaClasseInt(1);
        // MinhaClasseDouble meuDouble = new MinhaClasseDouble(3.14);
        // MinhaClasseChar meuChar = new MinhaClasseChar('@');
        // MinhaClasseString minhaString = new MinhaClasseString("Olá Mundo!");

        // System.out.println(meuInt.pegarValor());
        // System.out.println(meuDouble.pegarValor());
        // System.out.println(meuChar.pegarValor());
        // System.out.println(minhaString.pegarValor());

        //System.out.println();

        MinhaClasseGenerica<Integer, Integer> meuInt = new MinhaClasseGenerica<>(1, 9);
        MinhaClasseGenerica<Double, Double> meuDouble = new MinhaClasseGenerica<>(3.14, 1.02);
        MinhaClasseGenerica<Character, Character> meuChar = new MinhaClasseGenerica<>('@', '$');
        MinhaClasseGenerica<String, Character> minhaString = new MinhaClasseGenerica<>("Olá Mundo!", '!');

        // Estanciando uma ArrayList (estrutura bem similiar)
        // ArrayList<String> meusAmigos = new ArrayList<>();

        HashMap<Integer, String> users = new HashMap<>();

        System.out.println(meuInt.getValor());
        System.out.println(meuDouble.getValor());
        System.out.println(meuChar.getValor());
        System.out.println(minhaString.getValor());

    }
}
