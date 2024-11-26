public class Ex005 {
    public static void main(String[] args){
        // Expressão = Operadores + Operandos
        // Operandos = Valores, Variáveis, Números, Quantidade
        // Operadores = + - * / %

        int amigos = 10;

        int amigosMais = amigos + 1;
        // ou
        // amigos++;
        int amigosMenos = amigos - 1;
        // ou
        // amigos--;
        int amigosVezes = amigos * 2;
        // Divisão inteira
        int amigosDivididoInteiro = amigos / 2;
        // Divisão (casas decimais)
        double amigosDividido = (double)amigos / 3;
        int amigosResto = amigos % 3;

        System.out.println(amigosMais);
        System.out.println(amigosMenos);
        System.out.println(amigosVezes);
        System.out.println(amigosDivididoInteiro);
        System.out.println(amigosDividido);
        System.out.println(amigosResto);
    }
}
