public class Ex027 {
    public static void main(String[] args) {
        // Método printf()
        // Um método capaz de controlar, formatar e expor texto no console
        // dois argumentos = string formatada + (objeto/variável/valor)
        // % [flags] [precisão] [largura] [conversão-de-caracteres]

        boolean booleano = true;
        char caractere = '@';
        String texto = "Ryan";
        int inteiro = 50;
        double real = 123456.789;

        // [conversão-de-caracteres]
        System.out.printf("%b\n", booleano);
        System.out.printf("%d\n", inteiro);
        System.out.printf("%c\n", caractere);
        System.out.printf("%s\n", texto);
        System.out.printf("%f\n\n", real);

        // [largura]
        // Mínimo número de caracteres que devem ser escritas como output
        // Exemplo: 10 espaços
        System.out.printf("Olá %10s\n", texto);
        // Números negativos justificam o texto a esquerda, porém mantém a quantidade de espaços
        System.out.printf("Olá %-10s\n\n", texto);

        // [precisão]
        // Seta um número de dígitos de precisão que devem ser mostrados de valores com pontos flutuantes
        System.out.printf("Você tem isso isso aqui em dinheiro: R$%.2f\n\n", real);

        // [flags]
        // Adiciona um efeito para sua saída baseada na flag inserida no formatador
        // - : justifica a esquerda
        // + : da como output um sinal de [+] ou um [-] para um valor numérico
        // 0 : formata os espaços vazios com zero
        // , : vírgula separa grupos se os números forem maior que > 1000

        // Justificado esquerda
        System.out.printf("Você tem isso isso aqui em dinheiro: R$%-20f\n", real);
        // Justificado direita
        System.out.printf("Você tem isso isso aqui em dinheiro: R$%20f\n", real);
        // Adicionando simbolos de + e - (caso o número formatado for negativo, ele mostraráo símbolo de -)
        System.out.printf("Você tem isso isso aqui em dinheiro: %+f\n", real);
        // Formatando os espaços vazios com vários 0
        System.out.printf("Você tem isso isso aqui em dinheiro: R$%020f\n", real);
        // Formatando com vírgula
        System.out.printf("Você tem isso isso aqui em dinheiro: R$%,f", real);
    }
}
