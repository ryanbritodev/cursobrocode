import Ex035.*;

public class Ex035 {
    public static void main(String[] args) {
        // Passando Objetos
        Garagem garagem = new Garagem();

        Carro carro = new Carro("BMW");
        Carro carro1 = new Carro("Mustang");

        garagem.estacionar(carro);
        garagem.estacionar(carro1);
    }
}
