public class Ex087 {
    public static void main(String[] args) {

        // Genérico
        // Habilita que tipos (classes e interfaces) sejam definidos como parâmetros quando definindo:
        // Classes, Interfaces e Métodos
        // Um dos benefícios é eliminar a necessidade de criar múltiplas versões
        // de métodos ou classes para diferentes tipos de dados.
        // Use 1 versão (de um método ou uma classe) para referenciar TODOS os tipos de dados

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"A", "D", "E", "U", "S"};

        mostrarArray(intArray);
        mostrarArray(doubleArray);
        mostrarArray(charArray);
        mostrarArray(stringArray);

        System.out.println(pegarPrimeiro(intArray));
        System.out.println(pegarPrimeiro(doubleArray));
        System.out.println(pegarPrimeiro(charArray));
        System.out.print(pegarPrimeiro(stringArray));

    }

    // Só aceita dados do tipo Int (Integer)
    // public static void mostrarArray(Integer[] array) {
    //     for(Integer x : array) {
    //         System.out.println(x + " ");
    //     }
    //     System.out.println();
    // }

    // Método Genérico
    public static <Coisa> void mostrarArray(Coisa[] array) {
        for(Coisa x : array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    // Método Genérico com retorno (sem void)
    public static <Coisa> Coisa pegarPrimeiro(Coisa[] array) {
        return array[0];
    }

}
