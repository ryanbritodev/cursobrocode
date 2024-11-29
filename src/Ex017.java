public class Ex017 {
    public static void main(String[] args) {
        // Arrays
        // Arrays são usados para guardar múltiplos valores em uma única variável
        // Para transformar uma variável, devemos apenas adicionar os colchetes após sua declaração
        // Todos os itens devem ir dentro de colchetes
        String[] carros = {"Camaro", "Fusca", "Ferrari", "BMW"};
        // IMPORTANTE!!!
        // Para acessarmos cada elemento do array, devemos listar o index do elemento
        carros[0] = "Mustang";
        System.out.println(carros[0]);
        // Se acessarmos um elemento que está fora do range do array, temos uma exceção
        // Exemplo: carros[4]
        System.out.println(carros[3]);

        // Forma diferente de escrever um array, primeiro detalhando seu tamanho e depois inserindo seus elementos:
        String[] produtos = new String[3];
        produtos[0] = "Mouse";
        produtos[1] = "Teclado";
        produtos[2] = "Monitor";
        // System.out.println(produtos[0] + "\n" + produtos[1] + "\n" + produtos[2]);

        // Como iterar sobre um Array usando for (usando o método length para seu pegar seu tamanho):
        for(int i = 0; i < produtos.length;  i++){
            System.out.println(produtos[i]);
        }
    }
}
