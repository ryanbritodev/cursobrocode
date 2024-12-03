import Ex083.*;

public class Ex083 {
    public static void main(String[] args) {

        // Classes Anônimas
        // Um classe interna sem nome
        // Apenas um único objeto é criado por uma
        // O objeto pode ter "extras" ou "mudanças"
        // Não precisa criar uma classe interna separada
        // Sintaxe é similar a um construtor
        // Boa para Action Listeners

        Saudacoes saudacoes = new Saudacoes() {
            @Override
            public void Bemvindo() {
                System.out.println("Eai bro!");
            }
        };

        // Extras para uma outra classe
        Saudacoes saudacoes1 = new Saudacoes();

        saudacoes.Bemvindo();
        saudacoes1.Bemvindo();

    }
}
