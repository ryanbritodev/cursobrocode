package Ex090;

public class MinhaClasseGenerica <Coisa extends Number, Coisa2> {

    // Como "Coisa" extende "Number", nós podemos dizer que o escopo de tipos de dados que podemos passar
    // são limitados as Subclasses da Classe "Number", como Byte, Float, Long, Short...

    Coisa x;
    Coisa2 y;

    public MinhaClasseGenerica(Coisa x, Coisa2 y) {
        this.x = x;
        this.y = y;
    }

    public Coisa2 getValor(){
        return y;
    }
}
