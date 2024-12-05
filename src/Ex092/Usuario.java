package Ex092;

import java.io.Serializable;

public class Usuario implements Serializable {

    public String nome;
    // transient public String senha; // Isso não pode
    public String senha;

    public void ola() {
        System.out.println("Olá " + nome + "!");
    }

}