public class Ex003 {
    public static void main(String[] args){
        // Mudando variáveis de lugar
        String x = "Agua";
        String y = "Tang de Uva";
        String temporario;

        temporario = x;
        x = y;
        y = temporario;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
