package Ex030;

public class Humano {
    // Usando Constructors
    // Podemos definir alguns parâmetros para nosso objeto
    public String nome;
    public int idade;
    public double peso;
    public Humano(String nome, int idade, double peso){
        // Isso não funciona
        // nome = nome;
        // idade = idade;
        // peso = peso;

        // Devemos adicionar um valor para cada um desses parâmetros para referênciar o objeto em específico que estivermos trabalhando
        // Para isso, utilizamos a palavra "this"
        // Quando criamos/instânciamos uma classe, nós vamos imaginar que "this" é na verdade o nome do objeto que criamos, que no caso do Ex030 é "humano"
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        }

    public void comer(){
        System.out.println(this.nome + " está comendo!");
    }

    public void beber(){
        System.out.printf("%s está bebendo! *burp*\n", this.nome);
    }
}
