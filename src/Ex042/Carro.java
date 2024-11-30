package Ex042;

public class Carro {
    // Vamos começar criando algumas variáveis privadas:
    private String marca;
    private String modelo;
    private int ano;

    // Criando o construtor
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Criando os métodos Getter
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }

    // Criando os setters (para assim
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}
