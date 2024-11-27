import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Calculando a hipotenusa de um triângulo
        System.out.println("------ CÁLCULO DE HIPOTENUSA -----");
        System.out.println("Informe o tamanho do primeiro cateto: ");
        double ladoA = input.nextDouble();
        System.out.println("Informe o tamanho do segundo cateto: ");
        // Limpando
        // input.nextLine();
        double ladoB = input.nextDouble();
        double hipotenusa = (ladoA * ladoA) + (ladoB * ladoB);
        double hipotenusaQuadrado = Math.sqrt(hipotenusa);
        System.out.println("O tamanho da hipotenusa do seu triângulo △ é: " + hipotenusaQuadrado);
    }
}
