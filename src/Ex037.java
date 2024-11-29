import Ex037.*;

public class Ex037 {
    public static void main(String[] args) {
        // Herança
        // Processo onde uma classe adquire os atributos e métodos de uma outra
        Carro carro = new Carro();

        // Carro é descendente da classe Veiculo, ou seja, mesmo que não tiver nenhum método ou atributo, vai herdar da classe pai
        carro.ir();
        System.out.printf("Número de portas no carro: %d\n", carro.portas);
        System.out.printf("Número de rodas no carro: %d\n", carro.rodas);
        System.out.println();

        Bicicleta bike = new Bicicleta();
        System.out.printf("Número de rodas na bicicleta: %d\n", bike.rodas);
        System.out.printf("Número de pedais na bicicleta: %d\n", bike.pedais);
        bike.parar();

        // Cada atributo que passamos individual da classe, só pode ser acessado por aquela classe
    }
}
