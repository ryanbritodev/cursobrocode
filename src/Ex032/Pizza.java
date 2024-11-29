package Ex032;

public class Pizza {
    // Características da nossa Pizza
    public String massa;
    public String molho;
    public String queijo;
    public String topping;

    // Criando os Constructors para todos os parâmetros
    public Pizza(String massa, String molho, String queijo, String topping){ // Passando parâmetros
        this.massa = massa;
        this.molho = molho;
        this.queijo = queijo;
        this.topping = topping;
    }

    public Pizza(String massa, String molho, String queijo) { // Passando parâmetros
        this.massa = massa;
        this.molho = molho;
        this.queijo = queijo;
    }

    public Pizza(String massa, String molho){ // Passando parâmetros
        this.massa = massa;
        this.molho = molho;
    }

    public Pizza(String massa){ // Passando parâmetros
        this.massa = massa;
    }

    public Pizza(){
    }
}
