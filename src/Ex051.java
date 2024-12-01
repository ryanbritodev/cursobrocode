import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Ex051 {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);

        //  Criando um Audioplayer .wav em Java!
        File file = new File("src/Ex051.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String resposta = "";

        while (!resposta.equals("Q")){
            System.out.println("\nPLAYER DE MÚSICA 🎵");
            System.out.println("[P]............PLAY");
            System.out.println("[S]...........PARAR");
            System.out.println("[R]...........RESET");
            System.out.println("[Q]............SAIR");

            System.out.print("Opção: ");
            resposta = scanner.next();

            resposta = resposta.toUpperCase();

            switch (resposta) {
                case ("P"): clip.start();
                break;
                case ("S"): clip.stop();
                break;
                case ("R"): clip.setMicrosecondPosition(0);
                break;
                case ("Q"): clip.close();
                break;
                default:
                    System.out.println("Resposta inválida!");
            }
        }
        System.out.print("\nAté mais! 👋🏻👋🏻");
    }
}
