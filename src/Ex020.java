public class Ex020 {
    public static void main(String[] args){
        // Classes Wrapper
        // Oferecem uma maneira de usar tipos primitivos de dados como
        // dados com tipo de referência (como Strings)
        // Eles possuem métodos úteis e poder ser usados com coleções (ex. ArrayList)

        /* PRIMITIVO   WRAPPER
          ---------------------
           boolean     Boolean
           char        Character
           int         Integer
           double      Double */

        // Note que Strings não fazem parte desse tipo de dados primitivos nem Wrappers, pq já são de referência

        // Autoboxing = Conversão automática que o compilador do Java faz entre dados do tipo primitivo e suas correspondentes classes de objeto wrapper
        // Unboxing = O contrário do Autoboxing. Converte classes wrapper para primitivo automaticamente

        // Declarando 4 tipos de dados de REFERÊNCIA diferentes (Autoboxing)
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Ryan";

        // Tratando como dados do tipo primitivo:
        if(a == true) { // ou b = '@'
            System.out.println("Isso é verdade!");
        }

    }
}
