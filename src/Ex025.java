public class Ex025 {
    public static void main(String[] args) {
        // Tipos de Retorno dos Métodos
        int x, y;
        x = 3;
        y = 4;
        System.out.println(soma(x, y));
    }
    // Vamos criar uma função que vai retornar um valor para nós
    // Por isso, não podemos adicionar void, pois esse tipo de retorno não retorna nada
    static int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }
}
