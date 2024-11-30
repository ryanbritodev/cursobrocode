import Ex042.*;

public class Ex042 {
    public static void main(String[] args) {
        // Encapsulamento
        // Atributos de uma classe se tornam escondidos ou privados
        // Podem ser acessados somente através de métodos (getters e setters)
        // Você deve criar atributos privados se você não tem uma razão específica para fazer eles serem públicos ou protegidos, é uma boa prática 😁👍🏻

        // Carro carro = new Carro("Chevrolet", "Camaro", 2008);
        // System.out.println(carro.marca);

        // Aqui, temos um problema
        // Todas as variáveis estão escondidas por serem privadas, onde somente dentro será possível acessá-las dentro do próprio pacote/classe

        // Para isso, vamos criar os métodos getters e setters!
        Carro carro = new Carro("Chevrolet", "Camaro", 2008);
        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());

        // Agora, se quisermos atribuir um valor de um parâmetro, alterando ele, podemos usar o método setter
        // car.ano = 2022;
        // Isso não funciona enquanto não criarmos o método

        carro.setMarca("Ford");
        carro.setModelo("Mustang");
        carro.setAno(2019);

        System.out.println();

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.print(carro.getAno());

        // Encapsulamento é basicamente isso
        // Nós tornarmos os atributos da nossa classe privados e assim eles não podem ser acessados de qualquer outro lugar a não pelo nosso programa
        // Se precisarmos pegar o valor, usamos um método Getter
        // Se precisarmos definir/mudar um valor, usamos o método Setter
    }
}
