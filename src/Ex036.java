import Ex036.*;

public class Ex036 {
    public static void main(String[] args) {
        // Modificador "static"
        // Cópia única que pode ser aplicada em uma variável/método (ou até mesmo uma classe) que é criada e compartilhada
        // Essa classe "detém" o membro estático (static)
        // Tudo aquilo que é estático também é conhecido como membro estático
        // A classe que contém aquele membro estático é dona dela, seja uma variável ou um método, e ela é compartilhada entre todas as instâncias daquela classe
        Amigo amigo = new Amigo("Jorginho");
        Amigo amigo1 = new Amigo("Matheus");
        Amigo amigo2 = new Amigo("Lucas");
        Amigo amigo3 = new Amigo("Jimmy");
        // Todos as instâncias de amigo compartilham a mesma cópia da variável numeroDeAmigos
        // System.out.println(Amigo.numeroDeAmigos);

        Amigo.mostrarAmigos();

        // O método Round funciona utilizando o mesmo princípio
        // Chamamos a classe Math e seu método static
        // Não precisamos criar um objeto como Math math = new Math();
        // Math.round();

        // Podemos acessar a variável estática pela instância do objeto, como:
        // System.out.println(amigo1.numeroDeAmigos);
        // Porém, isso não é recomendável
        // É melhor acessarmos diretamente pela classe, e não pelo membro dela

        // System.out.println(amigo1.numeroDeAmigos);
        // Se tirarmos o static, o resultado do comando acima será igual para qualquer objeto instânciado:
        // 1
    }
}
