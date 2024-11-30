package Ex040;

public class Carro extends Veiculo {
    // Aqui, como declaramos um método abstrato, devemos adicionar sua implementação usando o Override (sobrescrevendo)
    @Override
    public void ir() {
        System.out.println("O motorista está dirigindo o carro");
    }
}
