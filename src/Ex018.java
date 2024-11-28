public class Ex018 {
    public static void main(String[] args) {
        // Array bidimensionais
        // São basicamentes arrays dentro de arrays, com linhas e colunas
        // Como declarar?

        // String[][] carros = new String[3][3];
        // carros[0][0] = "Camaro";
        // carros[0][1] = "Corvette";
        // carros[0][2] = "Fusca";
        // carros[1][0] = "Mustang";
        // carros[1][1] = "BMW";
        // carros[1][2] = "Ferrari";
        // carros[2][0] = "Mercedes";
        // carros[2][1] = "Kwid";
        // carros[2][2] = "Ranger";

        // OU

        String[][] carros = {
                                {"Camaro", "Corvette", "Fusca"},
                                {"Mustang", "BMW", "Ferrari"},
                                {"Mercedes", "Kwid", "Ranger"}
                            };

        // Iterando o Array
        for(int i = 0; i < carros.length; i++){
            if(i == 0){
            } else {
                System.out.println();
            }
            for(int c = 0; c < carros[i].length; c++){
                System.out.print(carros[i][c] + " ");
            }
        }
    }
}
