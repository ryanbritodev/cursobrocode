package Ex039;

public class Heroi extends Pessoa {
    public String poder;
    public Heroi(String nome, int idade, String poder) {
        // No construtor de Heroi:
        // O super(nome, idade) chama o construtor da classe Pessoa para inicializar os atributos nome e idade. Assim, evitamos duplicar código, pois a lógica para inicializar esses atributos já está pronta na superclasse.
        // Com super, nós definimos que a classe Pessoa é seus atributos no super, e podemos reutilizar seu construtor na nossa classe herói
        super(nome, idade);
        this.poder = poder;
    }
    public String toString() {
        return super.toString() + "\n" + this.poder;
    }
}
