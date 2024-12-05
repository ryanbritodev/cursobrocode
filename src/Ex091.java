import Ex091.*;

import java.io.*;

public class Ex091 {
    public static void main(String[] args) throws IOException {

        // Serialização
        // O processo de converter um objeto em um sequência de bytes
        // O benefício é que o objetos PERSISTE (salve o estado daquele objeto) após o programa ser encerrado
        // Ele pode ser salvo como um arquivo ou enviado através de rede
        // (ou até mesmo outro computador)
        // Sequência de Bytes pode ser salva em um arquivo (.ser) que é universal
        // (Funciona como o processo de salvar um arquivo com as informações do objeto)

        // Desserialização
        // Processo reverso de converter uma sequência de bytes em um objeto
        // (Basicamente como funciona quando carregamos um arquivo salvo)

        // Passos para Serializar
        // 1. Sua classe de objeto deve implementar a interface "Serializable"
        // 2. Adicione o import "java.io.Serializable;"
        // 3. FileOutputStream fileOut = new FileOutputStream(caminho_do_arquivo)
        // 4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
        // 5. out.writeObject(nomeObjeto)
        // 6. out.close(); | fileOut.close();

        Usuario usuario = new Usuario();

        usuario.nome = "Ryanzinho";
        usuario.senha = "password";
        // usuario.ola();

        FileOutputStream fileOut = new FileOutputStream("src/InfoUser.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(usuario);
        out.close();
        fileOut.close();

        System.out.println("Informações do Objeto salvas com sucesso! :)");

        long serialVersionUID = ObjectStreamClass.lookup(usuario.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);

    }
}
