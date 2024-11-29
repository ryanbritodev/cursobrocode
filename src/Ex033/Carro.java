package Ex033;

public class Carro {
    public String marca = "Ford";
    public String modelo = "Mustang";
    public String cor = "Vermelho";
    public int ano = 2021;

    // Mudando a função do método para mostrar todos os elementos da classe
    public String toStringo() {
        return marca + "\n" + modelo + "\n" + cor + "\n" + ano;
    }
}
