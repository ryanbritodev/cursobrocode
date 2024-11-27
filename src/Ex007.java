public class Ex007 {
    public static void main(String[] args){
        double x = 3.14;
        double y = -10;

        // Método para retornar o maior valor entre variáveis
        double z = Math.max(x, y);
        double a = Math.min(x, y);
        System.out.println("Maior valor entre x e y: " + z);
        System.out.println("Menor valor entre x e y: "+ a);

        // Converte o número para seu valor absoluto
        double b = Math.abs(y);

        // Método para calcular raíz quadrada
        int c = 64;
        double d = Math.sqrt(c);

        System.out.println("Valor absoluto de y (módulo): " + b);
        System.out.println("Raíz quadrada de " + c + ": " + d);

        // Arredondar
        double e = Math.round(x);
        System.out.println("O número " + x + " arredondado é igual a " + e);

        // Arredondar para cima
        double f = Math.ceil(x);
        System.out.println("O número " + x + " arredondado para cima é igual a " + f);

        // Arredondar para baixo
        double h = Math.floor(x);
        System.out.println("O número " + x + " arredondado para baixo é igual a " + h);
    }
}
