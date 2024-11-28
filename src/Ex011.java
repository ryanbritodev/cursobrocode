public class Ex011 {
    public static void main(String[] args) {
        // Switch em Java
        // Declarção que permite uma variável ser testada para igualdade contra uma lista de valores
        // Estrutura de Controle de Fluxo, que permite tomar decisões com base no valor de uma variável ou expressão
        // Pode ser usada com int, byte, short, char e String

        String dia = "Sexta-feira";

        // Dentro do parentesês, inserimos o valor a ser comparado com a lista de possíveis valores
        // Se não houver nenhum encontro de valores, ele simplesmente não irá mostrar nada na tela, ao menos que usemos o "default"
        switch(dia) {
            case "Domingo": System.out.println("É domingo!");
            break;
            case "Segunda-feira": System.out.println("É segunda-feira!");
            break;
            case "Terça-feira": System.out.println("É terça-feira!");
            break;
            case "Quarta-feira": System.out.println("É quarta-feira!");
            break;
            case "Quinta-feira": System.out.println("É quinta-feira!");
            break;
            case "Sexta-feira": System.out.println("É sexta-feira!");
            break;
            case "Sábado": System.out.println("É sábado!");
            break;
            default: System.out.println("Isso não é um dia da semana!");
            break;
        }

    }
}
