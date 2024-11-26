public class Ex002 {
    public static void main(String[] args){
        int x; // Declaração
        x = 123; // Atribuição
        int y = 456; // Inicialização
        System.out.println(x);
        System.out.println(y);
        System.out.println("Meu número é: " + x + y);
        long z = 123456789;
        System.out.println("Meu número longo é: " + z);
        // Precisa do F após a declaração, armazena 6/7 digítos após a casa decimal
        float a = 3.14f;
        System.out.println(a);
        // Não precisa do F e armazena até 15 dígitos após a casa decimal
        double b = 5.3424345435;
        System.out.println(b);
        boolean c = true;
        boolean d = false;
        System.out.println(c);
        System.out.println(d);
        char simbolo = '@'; // Precisa ser aspas simples
        String name = "Ryan";
        System.out.println(simbolo);
        System.out.println("Olá! Meu nome é " + name);
    }
}
