package Ex041b;
import Ex041a.*;

// Se retirarmos o public da classe, por exemplo, essa classe só será visível para outras classes do mesmo pacote
public class C {
    public String mensagemPublica = "Essa mensagem é pública";
    String mensagemPadrao = "Essa mensagem é padrão";
    protected String mensagemProtegida = "Essa mensagem é protegida";
    private String mensagemPrivada = "Essa mensagem é privada";
}
