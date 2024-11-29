import Ex038.*;

public class Ex038 {
    public static void main(String[] args) {
        // Sobrescrita de Métodos
        // Ato de declarar um método em uma subclasse, que já está presente numa classe pai
        // Feito para que a classe filho possa ter sua própria implementação
        Cachorro cachorro = new Cachorro();
        cachorro.falar();

        Animal animal = new Animal();
        animal.falar();
    }
}
