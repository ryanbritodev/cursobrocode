package Ex089;

public class MinhaClasseGenerica <Coisa, Coisa2> {

    // Pode aceitar múltiplos parâmetros

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
