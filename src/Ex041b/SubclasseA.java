package Ex041b;
import Ex041a.*;

public class SubclasseA extends A {
    // Para começarmos com os modificadores de acesso, vamos começar com o padrão (sem modificador)
    // Aqui conseguimos acessar por estarmos no mesmo pacote
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.mensagemPadrao);

        // Aqui, conseguimos instanciar a subclasse, que está herdando a mensagem protegida, e acessar a mensagem protegida
        SubclasseA suba = new SubclasseA();
        System.out.println(suba.mensagemProtegida);
    }
}
