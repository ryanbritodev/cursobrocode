package Ex029;

public class Carro {
    // Tornando as variáveis públicas para acessá-las fora do pacote
    public String marca = "Chevrolet";
    public String modelo = "Corvette";
    public int ano = 2020;
    public double valor = 50000.00;

    public void dirigir() {
        System.out.println("Você está dirigindo o carro!");
    }

    public void frear() {
        System.out.println("Você pisou no freio!");
    }
}
