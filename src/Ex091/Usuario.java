package Ex091;

import java.io.Serializable;

public class Usuario implements Serializable {

    public String nome;
    public String senha;

    public void ola() {
        System.out.println("Olá " + nome + "!");
    }

}
