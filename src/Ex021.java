import java.util.ArrayList;

public class Ex021 {
    public static void main(String[] args){
        // Arraylist
        // Uma Arraylist é uma coleção que pode ter seu tamanho alterado. Seus elementos podems ser removidos ou adicionados APÓS a fase de compilação
        // Eles armazenam dados do tipo de referência
        // !!!IMPORTANTE!!!
        // Sempre importar o módulo java.util.ArrayList;

        // Como podemos criar uma ArrayList?
        ArrayList<String> comida = new ArrayList<String>(); // Dentro das setas, devemos colocar o tipo de dado que vai ser armazenado (sempre de referência)

        // Como adicionamos itens a ArrayList?
        // Usamos o método add!
        comida.add("pizza");
        comida.add("hamburguer");
        comida.add("cachorro quente");

        // Substituindo o valor no index 0 por Sushi
        comida.set(0, "sushi");
        // Removendo o valor no Index
        comida.remove(2);
        // Limpado a ArrayList
        // comida.clear();

        // Usando os métodos .size para tamanho e .get para capturar o valor no index
        for(int i = 0; i < comida.size(); i++){
            System.out.println(comida.get(i));
        }
    }
}
