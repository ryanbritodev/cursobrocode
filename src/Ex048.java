import java.io.File;

public class Ex048 {
    public static void main(String[] args) {
        // Arquivos
        // Um representação abstrata de um arquivo e caminhos de um diretório/pasta

        // Vamos ver se temos um arquivo chmado Ex048.txt usando a classe File

        File file = new File("C:/Users/ryanb/arquivo_secreto.txt");
        File file1 = new File("src/Ex048.txt");

        // Verificando se o arquivo existe ou não
        if (file1.exists()) {
            System.out.println("O arquivo existe! :O");
            // Caminho Relativo
            System.out.println(file1.getPath());
            // Caminho Absoluto
            System.out.println(file1.getAbsolutePath());
            // Verificar se é um arquivo mesmo, e não uma pasta
            System.out.println(file1.isFile()); // Retorna true ou falso
            // Deleta o arquivo
            // file1.delete();
        } else {
            System.out.println("O arquivo não existe! :(");
        }

        System.out.println();

        if(file.exists()) {
            System.out.println("O arquivo existe! :O");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
        } else {
            System.out.println("O arquivo não existe! :(");
        }

    }
}
