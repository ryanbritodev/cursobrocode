package Ex036;

public class Amigo {
    public String nome;
    // Se removermos o static da variável, não vamos poder acessar ela mais
    // Cada um dos objetos de "Amigo" que instanciamos vai ter sua própria cópia da variável numeroDeAmigos
    public static int numeroDeAmigos;

    public Amigo(String nome){
        this.nome = nome;
        numeroDeAmigos++;
    }

    public static void mostrarAmigos(){
        System.out.printf("Você tem %d amigos!", numeroDeAmigos);
    }

}
