package Ex043;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
    }

    public Carro(Carro x) {
       this.copy(x);
    }

    public void copy(Carro x) {
        this.setMarca(x.getMarca());
        this.setModelo(x.getModelo());
        this.setAno(x.getAno());
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

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
