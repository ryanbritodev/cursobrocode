import Ex044.*;

public class Ex044 {
    public static void main(String[] args) {
        // Interface em Java
        // Um template/formato que pode ser aplicado para uma classe
        // Parecido com herança, mas especifíca o que classe pode/deve fazer
        // Classes podem ter mais de uma interface, herança é limitada a 1 super
        Coelho cueio = new Coelho();
        cueio.fugir();

        Aguia aguia = new Aguia();
        aguia.cacar();

        // Esse método é exclusivo da interface Presa, por isso, não irá funcionar nesse caso
        // aguia.fugir():

        Peixe pexe = new Peixe();
        pexe.cacar();
        pexe.fugir();
    }
}
