import java.io.FileWriter;
import java.io.IOException;

public class Ex049 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("poema.txt");
            writer.write("Rosas são vermelhas\nvioletas são azuis.\nPare de soltar pum,\nem nome de Jesus.");
            writer.append("\n(Um poema por Ryanzinho)");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
