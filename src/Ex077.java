public class Ex077 {
    public static void main(String[] args) {

        // Encadeamento de Métodos
        // Uma síntaxe comum para invocar chamadas de múltiplos métodos em POO (Orientação a Objetos)
        // Condesa o código em menos linhas

        // Vamos criar um objeto, como uma String
        String nome = "  ryan";

        // Nós podemos usar diversos métodos nessa variável, como concatenar
        // nome = nome.concat(" brito  ");
        // Vamos usar um segundo
        // nome = nome.toUpperCase();
        // Agora um Terceiro
        //nome = nome.trim();
        // Dessa maneira acima, o programa está ocupando 3 linhas de código para chamar três métodos

        // Vamos encadear!
        nome = nome.concat(" bRiTo    ").toUpperCase().trim();

        System.out.println(nome);

    }
}
