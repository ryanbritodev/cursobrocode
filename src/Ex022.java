import java.util.*;

public class Ex022 {
    public static void main(String[] args){
        // ArrayList Bidimensional
        ArrayList<ArrayList<String>> listaCompras = new ArrayList<ArrayList<String>>();

        ArrayList<String> listaPadaria = new ArrayList<String>();
        listaPadaria.add("macarrão");
        listaPadaria.add("pão de alho");
        listaPadaria.add("donuts");

        ArrayList<String> listaComplementos = new ArrayList<String>();
        listaComplementos.add("tomates");
        listaComplementos.add("pimenta");
        listaComplementos.add("páprica");

        ArrayList<String> listaBebidas = new ArrayList<String>();
        listaBebidas.add("coca-cola");
        listaBebidas.add("vinho");

        listaCompras.add(listaPadaria);
        listaCompras.add(listaComplementos);
        listaCompras.add(listaBebidas);

        // ArrayList completa
        System.out.println(listaCompras);

        // Acessando um index
        System.out.println(listaCompras.get(0));

        // Acessando um index de uma ArrayList interna
        System.out.println(listaCompras.get(2).get(1));
    }
}
