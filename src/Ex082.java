import Ex082.*;

public class Ex082 {
    public static void main(String[] args){

        // Inner Class
        // Uma classe dentro de outra classe
        // Útil para limitar se uma classe deve ficar naquele escopo
        // Normalmente é privada, mas não é necessário
        // Ajuda outros grupos de classes que pertencem juntas
        // Extramemente útil para ouvintes específicos
        // Precursor para classes inner classes anônimas

        Fora fora = new Fora();

        // Instanciando uma classe dentro de outra
        Fora.Dentro dentro = fora.new Dentro();

        // System.out.println(fora.x + dentro.y);

        dentro.Saudar();

    }
}
