import java.io.*;
import Ex091.Usuario;

public class Ex092 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Passos para Desserializar
        // 1. Declarar um Objeto (não instanciar!)
        // 2. Nossa classe deve implementar a interface "Serializable"
        // 3. Adicionar o import "java.io.Serializable;"
        // 4. FileInputStream fileIn = new FileInputStream("caminho_do_arquivo");
        // 5. ObjectInputStream in = new ObjectInputStream(fileIn);
        // 6. nome_do_objeto = (Classe) in.readObject();
        // 7. in.close(); fileIn.close();

        // NOTAS IMPORTANTES
        // Classes filhas de uma classe pai que implementa a interface Serializable possuem o mesmo poder
        // Quaisquer campos estáticos da classe não são serializados (eles pertecem a classe e não ao objeto)
        // A definição da classe "class file" não é lembrada, por isso devemos fazer o cast passando o tipo de objeto
        // Campos declarados como "transientes" não são serializados, e sim ignorados
        // serialVersionUID é uma versão única do ID

        // serialVersionUID
        // É um ID único que funciona como uma versão
        // Verifica se o sender e o receiver do objeto serializado
        // carregou classes que encaixam com aquele objeto
        // Garante que o objeto vai ser compatível entre máquinas
        // Número deve bater, se não vai causar uma InvalidClassException
        // Um SerialVersionUID vai ser calculada baseada nas propriedas da classe, membros e etc

        Usuario usuario;
        FileInputStream fileIn = null;

        try {
            fileIn = new FileInputStream("src/InfoUser.ser");
        }
        catch (FileNotFoundException e) {
            System.out.print("Arquivo não criado! Vá ao exercício Ex091 e crie o arquivo >:(");
            System.exit(1);
        }

        ObjectInputStream in = new ObjectInputStream(fileIn);
        usuario = (Usuario) in.readObject(); // cast
        in.close();
        fileIn.close();

        System.out.println(usuario.nome);
        System.out.println(usuario.senha);
        usuario.ola();

    }
}
