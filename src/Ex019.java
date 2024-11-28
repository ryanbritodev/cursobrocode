public class Ex019 {
    public static void main(String[] args) {
        // Métodos de String
        // Um tipo de dado de referência que pode armazenar um ou mais caracteres
        // Ele tem métodos extremamente úteis
        String nome = "Ryan";
        String palavrona = "     Olá!     ";
        // Digitando "nome." e apertando a tecla ctrl + espaço podemos ter acesso a lista completa de métodos de string
        // Verificar se é igual (retornando true ou false):
        boolean resultado = nome.equals("Cássio");
        // Ignora qualquer tipo de caractere maiúsculo
        boolean resultado2 = nome.equalsIgnoreCase("ryan");
        // Armazena o tamanho da String (Ryan = 4 letras)
        int resultado3 = nome.length();
        // Método Char, retorna apenas um caractere na posição passada
        char resultado4 = nome.charAt(0);
        // Verifica se a string está vazia ou não
        boolean resultado5 = nome.isEmpty();
        // Transformar a string em letras maiúsculas e minúsculas
        String resultado6 = nome.toUpperCase();
        // Transforma a string em letras minúsculas
        String resultado7 = nome.toLowerCase();
        // Removendo o espaço vazio antes e depois da string
        String resultado8 = palavrona.trim();
        // Substituindo os caracteres escolhido na String pelos os quais você desejar
        String resultado9 = nome.replace("R", "N");

        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
        System.out.println(resultado5);
        System.out.println(resultado6);
        System.out.println(resultado7);
        System.out.println(resultado8);
        System.out.println(resultado9);
    }
}
