import Ex040.*;

public class Ex040 {
    public static void main(String[] args){
        // Abstração
        // Classes abstratas não pode ser instanciadas, mas podem tem uma subclasse
        // Métodos abstratos são declarados sem uma implementação

        // Vamos trabalhar com duas classes, sendo uma chamada principal chamada veículo e uma subclasse/classe-filho chamada carro

        // Instanciando os objetos das classes
        // Veiculo veiculo = new Veiculo(); // Repare que não podemos mais instanciar esse objeto, agora devemos pegar uma classe filha, como um carro, uma moto, uma bicicleta
        Carro carro = new Carro();

        // Criamos uma barreira de segurança, onde só será possível instanciar no objeto carro
        carro.ir();

        // Vamos supor que entramos em uma concessionária e pedimos um veículo
        // Nós devemos escolher um tipo de veículo, e não apenas um veículo genérico/abstrato
        // Para isso, adicionamos a palavra abstract para prevenir de alguém criar uma instância de uma classe muito vaga
    }
}
