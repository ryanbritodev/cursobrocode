import Ex043.*;

public class Ex043 {
    public static void main(String[] args) {
        // Copiando Objetos

        Carro carro1 = new Carro("BYD", "Song Plus", 2024);
        Carro carro2 = new Carro("GWM", "Ora", 2023);

        // Isso aqui NÃO copia o objeto, e sim o mesmo endereço, apontando para o mesmo carro
        // carro2 = carro1;
        // Para isso, temos que criar um método de cópia
        carro2.copy(carro1);
        // Temos endereços diferentes, porém valores iguais

        // Podemos criar também uma cópia de construtor
        // Para isso, vamos criar um outro caso de instância usando Overload Constructors
        Carro carro3 = new Carro(carro1);

        // Endereços na Memória
        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
        System.out.println();
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAno());
        System.out.println();
        System.out.println(carro2.getMarca());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getAno());
        System.out.println();
        System.out.println(carro3.getMarca());
        System.out.println(carro3.getModelo());
        System.out.print(carro3.getAno());
    }
}
