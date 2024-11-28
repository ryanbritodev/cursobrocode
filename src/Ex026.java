public class Ex026 {
    public static void main(String[] args) {
        // Métodos Overload
        // São métodos que possuem nomes iguais, porém parâmetros diferentes
        // Cada um deles possui a sua própria assinatura, que é basicamente dada por:
        // nome do método + parâmetros = assinatura

        // int x = soma(5, 5);
        // int x = soma(5, 5, 5);
        // int x = soma(5, 5, 5, 5);
        double x = soma(5.2, 5.8, 5.4, 5.7);
        System.out.print(x);

        // Com métodos de overload, não é somente a quantidade de valores que é levada em consideração
        // Também temos que levar em consideração os tipos de dados
    }
    static int soma(int a, int b) {
        System.out.println("Esse é o método 1");
        return a + b;
    }

    static int soma(int a, int b, int c) {
        System.out.println("Esse é o método 2");
        return a + b + c;
    }

    static int soma(int a, int b, int c, int d) {
        System.out.println("Esse é o método 3");
        return a + b + c + d;
    }

    static double soma(double a, double b) {
        System.out.println("Esse é o método 4");
        return a + b;
    }

    static double soma(double a, double b, double c) {
        System.out.println("Esse é o método 5");
        return a + b + c;
    }

    static double soma(double a, double b, double c, double d) {
        System.out.println("Esse é o método 6");
        return a + b + c + d;
    }

}
