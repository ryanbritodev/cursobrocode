import Ex029.Carro; // Importando classe "Carro"

public class Ex029 {
    public static void main(String[] args) {
        // Programação Orientada a Objetos em Java (OOP)
        // Objeto = Uma instância de uma classe que deve conter atributos (características do objeto) e métodos (ações do seu objeto)
        // Exemplo: (Celular, Mesa, Computador, Xícara de Café)
        // Vamos imaginar os atributos de uma Xícara de Café:
        // String cor = "white";
        // double temp = 20.0;
        // boolean vazio = true;
        // Agora, vamos pensar em seus métodos principais
        // beber()
        // {System.out.println("Você bebeu o café!");}
        // derramar()
        // {System.out.println("Você derramou o café :(");}
        // Para criarmos uma instância de uma outra classe, criando um objeto de "Carro", precisamos chamá-la

        Carro meuCarro = new Carro();
        Carro meuCarro2 = new Carro();

        // Mostrando os atributos do carro
        System.out.println(meuCarro.marca);
        System.out.println(meuCarro.modelo);

        System.out.println();

        // Chamando os métodos
        meuCarro.dirigir();
        meuCarro.frear();

        System.out.println();

        // Para resolver o problema de termos objetos iguais sempre, caso nós precisemos criar um objeto novo a partir daquele modelo,
        // Utilizamos Constructors na classe do objeto para que possamos alterar
        System.out.println(meuCarro2.marca);
        System.out.println(meuCarro2.modelo);
    }
}
