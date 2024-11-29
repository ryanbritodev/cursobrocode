import Ex039.*;

public class Ex039 {
    public static void main(String[] args) {
        // Super
        // Faz referência a uma superclasse (pai) do objeto
        // Bem similar ao "this"
        Heroi heroi = new Heroi("Batman", 42, "Dinheiro $$$");
        Heroi heroi2 = new Heroi("Superman", 38, "Tudo 💪🏻");

        // System.out.println(heroi.nome);
        // System.out.println(heroi.idade);
        // System.out.println(heroi.poder);

        System.out.println(heroi);
        System.out.println();
        System.out.println(heroi2);
    }
}
