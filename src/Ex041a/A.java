package Ex041a;
import Ex041b.*;

public class A {
    // Vamos criar uma string dentro da classe C, sem modificador
    protected String mensagemProtegida = "Essa mensagem é protegida";
    public static void main(String[] args) {
        // Vamos criar uma string dentro da classe C, sem modificador
        // Agora, vamos instanciar essa classe como um objeto e tentar printar a string dentro dela
        // C c = new C();
        // A string não pode ser printada se não estiver vísivel aos olhos do pacote Ex041a, ou seja,
        // Somente o que estiver dentro daquele pacote poderá ser printado
        // Não irá funcionar ↓↓↓
        // System.out.println(c.mensagemPadrao);

        // Vamos tentar acessar agora a mensagem pública do outro pacote, na classe C
        C c = new C();
        System.out.println(c.mensagemPublica);

        // Mesmo estando no mesmo pacote, não podemos acessar essa mensagem pelo fato dela estar privada
        B b = new B();
        // System.out.println(b.mensagemPrivada);
    }
}
