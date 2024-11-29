import Ex030.Humano; // Importando a classe "Humano" para instanciarmos

public class Ex030 {
    public static void main(String[] args) {
        // Constructor
        // Método especial que é chamado quando um objeto é instanciado (criado)
        // Para essa aula, vamos usar a classe "Humano"
        // Ao instanciarmos essa classe, ele irá chamar o constructor, e tudo o que estiver irá ser executado (bem similar aos métodos)
        // Devemos passar os parâmetros definidos na classe
        Humano humano = new Humano("Ryan", 19,70.2);
        Humano humano2 = new Humano("Cássio", 38, 81.7);
        System.out.println(humano.nome);
        System.out.println(humano2.nome);

        System.out.println();

        humano.comer();
        humano2.comer();

        System.out.println();

        humano.beber();
        humano2.beber();
    }
}
