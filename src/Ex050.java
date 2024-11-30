import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex050 {
    public static void main(String[] args) {
        // FileReader (leitor de arquivos)
        // Le o conteúdo de um arquivo como um conjunto de caracteres (lendo um por um)
        // read() retorna um valor do tipo int que contém o valor em bytes
        // quando o método read() retornar -1, não há mais dados para ler

        // Devemos rondar ele com um try/catch, pois é considerado código perigoso
        // DICA: O próprio Intellij já completa automaticamente para você

        try {
            FileReader reader = new FileReader("src/Ex050.txt");
            int data = reader.read();
            // Enquanto for diferente de um (arquivo não tiver mais bytes para serem lidos), ele vai ler cada caractere e printar na tela
            // Convertermos o valor do data (bytes) para caracteres
            // IMPORTANTE!!!
            // Usar print e não println, para não pular as linhas a cada caractere lido
            while (data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
