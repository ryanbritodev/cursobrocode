package Ex038;

public class Cachorro extends Animal{
    // Dando a classe Cachorro sua própria implementação do método falar, da classe Animal
    // Uma boa prática é adicionar a notação "@Override" para mostrar que estamos sobrescrevendo um método já existente
    @Override
    public void falar() {
        System.out.println("O cachorro está latindo *au au*");
    }
}
