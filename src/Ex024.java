public class Ex024 {
    public static void main(String[] args) {
        // Métodos
        // São blocos de código que são executados assim que são chamados
        // Quando começamos um novo programa, chamamos o método "main" no começo, e tudo que estiver dentro dele vai ser executado

        // Nós podemos passar argumentos para o nosso método criado, que funcionam como variáveis, listando o tipo de parâmetro que o método deve esperar
        // O parâmetro do método pode ter o nome que você quiser
        String nome = "Ryan";
        int idade = 19;

        ola(nome, idade);
    }

    // Para criarmos nosso próprio método, precisamos de um tipo de retorno para ele, como "void"
    // Ele deve possuir o static, pois não podemos fazer referência a um método que não seja static dentro de outro método que é
    static void ola(String nome, int idade) {
        // Estamos dentro do método olá! Tudo que estiver dentro dele vai ser executado assim que ele for chamado
        System.out.println("Olá, " + nome + "!");
        System.out.print("Você tem " + idade + " anos de idade!");
    }

}
