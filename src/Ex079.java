import java.util.HashMap;

public class Ex079 {
    public static void main(String[] args) {

        // HashMaps
        // Implementam a Interface de Mapa (precisa de import)
        // É similar a uma ArrayList (que armazenam objetos), porém com pares de chave-valor
        // Armazena objetos, precisa utilizar classes Wrapper (capitalizadas)
        // ex: (nome, email), (usuário, id), (pais, capital)

        // <Tipo de Dado>
        HashMap<String, String> paises = new HashMap<String, String>();

        // Adicionando um par chave-valor
        paises.put("Brasil", "Brasília");
        paises.put("Estados Unidos", "Washington DC");
        paises.put("Índia", "Nova Delhi");
        paises.put("Rússia", "Moscou");
        paises.put("China", "Beijing");

        // System.out.println(paises);

        // Como remover um país?
        paises.remove("China");
        System.out.println(paises);

        // Podemos pegar uma capital de um país
        paises.get("Brasil");
        System.out.println(paises.get("Brasil"));

        // Limpando tudo
        // paises.clear();

        // Tamanho
        int tamanho = paises.size();
        System.out.println(tamanho);

        // Método Replace
        paises.replace("Rússia", "Sibéria");
        System.out.println(paises);

        boolean temInglaterra = paises.containsKey("Inglaterra");
        System.out.println(temInglaterra);

        boolean temBrasil = paises.containsKey("Brasil");
        System.out.println(temBrasil);

        boolean temWash = paises.containsValue("Washington DC");
        System.out.println(temWash);

        System.out.println();

        for(String i : paises.keySet()) {
            System.out.print(i+"\t"+"= ");
            System.out.println(paises.get(i));
        }
    }
}
