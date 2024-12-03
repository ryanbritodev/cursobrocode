enum Planeta {
    // Usar MAIÚSCULAS
    // Podemos atribuir alguns valores, assim como os argumentos de objetos
    MERCURIO(1),
    VENUS(2),
    TERRA(3),
    MARTE(4),
    JUPITER(5),
    SATURNO(6),
    URANO(7),
    NETUNO(8),
    PLUTAO(9);

    int numero;

    // Construindo
    Planeta(int numero) {
        this.numero = numero;
    }
}

public class Ex078 {
    public static void main(String[] args) {

        // Enum
        // Lista de itens ordenadas em uma coleção
        // Grupo de **constantes** que se comportam como objetos
        // Não podem ser alteradas (como variáveis finais/imutáveis)
        // Ex: Planetas, Dias, Meses

        // Como criar? ↑↑↑ (Parecido com a criação de uma classe)

        // Vamos instanciar o nosso Enum
        Planeta meuPlaneta = Planeta.TERRA; // Diferente de um objeto comum, usamos o nosso da constante (ao invés de new)
        // Planeta meuPlaneta2 = Planeta.MARTE;
        possoViverAqui(meuPlaneta);
        // possoViverAqui(meuPlaneta2);

    }

    static void possoViverAqui(Planeta meuPlaneta) {
        switch (meuPlaneta){
            case TERRA:
                System.out.println("Você PODE viver aqui! :)");
                System.out.println("Esse é o planeta #" + meuPlaneta.numero);
                break;
            default:
                System.out.println("Você NÃO PODE viver aqui! :( (ainda...)");
                System.out.println("Esse é o planeta #" + meuPlaneta.numero);
                break;
        }
    }

}
