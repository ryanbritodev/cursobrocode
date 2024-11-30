import Ex045.*;

public class Ex045 {
    public static void main(String[] args) {
        // Polimorfismo em Java
        // Palavra grega que significa "muitas formas" (poly-"muitos", morfismo-"forma")
        // É a habilidade de um objeto se identificar com mais de um tipo

        // Todos eles são filhos da Classe Veiculo
        Carro carro = new Carro();
        Bike bicicleta = new Bike();
        Barco barco = new Barco();

        // Carro[] corredores = {carro, bicicleta, barco}; // Aqui só podemos armazenar no Array objetos do tipo carro
        // Bike[] corredores = {carro, bicicleta, barco}; // Aqui só podemos armazenar no Array objetos do tipo bicicleta
        // Barco[] corredores = {carro, bicicleta, barco}; // Aqui só podemos armazenar no Array objetos do tipo barco

        // Como resolvemos esse problema?
        // Polimorfismo!
        // Todos eles tem em comum a extensão da classe Veículo

        // ou Object[]
        Veiculo[] corredores = {carro, bicicleta, barco};

        // O for qual tipo de veículo você é, ele apenas vai iterar no array corredores todos os objetos que fazem parte da classe veiculo, executando seu método sobrescrito em comum entre todos
        for (Veiculo x : corredores) {
            x.ir();
        }
    }
}
