import java.util.ArrayList;

public class Ex023 {
    public static void main(String[] args) {
        // Loop for-each
        // Técnica para iterar sobre os elementos de um array/coleção
        // Menos passos, mais legível
        // Menos flexível

        // Array
        String[] animais = {"gato", "cachorro", "arara", "rato"};

        // ArrayList (coleção)
        ArrayList<String> zoologico = new ArrayList<String>();
        zoologico.add("gato");
        zoologico.add("cachorro");
        zoologico.add("rato");
        zoologico.add("arara");

        // Criando um loop for-each
        // Primeiro, devemos listar o tipo de dado que temos na nossa arraylist
        // Depois, precisamos definir um index e colocar ":"
        // O ":" representa a palavra "dentro", ou seja, para cada index de string dentro do nosso array... ela vai tomar a forma dele
        // Último passso: definir a lista a ser iterada após o ":"

        for(String i : animais) {
            System.out.println(i);
        }

        System.out.println();

        for(String i : zoologico){
            System.out.println(i);
        }
    }
}
