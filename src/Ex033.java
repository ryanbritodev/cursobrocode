import Ex033.Carro;

public class Ex033 {
    public static void main(String[] args) {
        // método toString()
        // Método que todos os objetos herdam
        // Ele retorna uma string que representa "textualmente" um objeto
        // Pode ser usada tanto implicitamente como explicitamente
        Carro carro = new Carro();

        // Que p#### é esse?
        System.out.println(carro);
        // É o endereço onde você pode achar esse objeto na memória do computador!
        System.out.println(carro.toStringo());
        // Repare que ele já é utilizado implicitamente quando printamos algo

        // System.out.println(carro.marca);
        // System.out.println(carro.modelo);
        // System.out.println(carro.cor);
        // System.out.print(carro.ano);
    }
}
