package Ex099;

import java.util.*;

public class Cripto {

    private Scanner scanner;
    private Random random;
    private ArrayList<Character> lista;
    private ArrayList<Character> listaMisturada;
    private char caractere;
    private String linha;
    private char[] letras;
    private char[] letrasSecretas;

    public Cripto() {
        scanner = new Scanner(System.in);
        random = new Random();
        lista = new ArrayList();
        listaMisturada = new ArrayList();
        caractere = ' ';

        newKey();
        pergunta();
    }

    private void pergunta(){
        while (true) {
            System.out.println("**************************");
            System.out.println("    ESCOLHA UMA OPÇÃO:    ");
            System.out.println("[N]...................Novo");
            System.out.println("[P]..................Pegar");
            System.out.println("[C]...........Criptografar");
            System.out.println("[D]........Descriptografar");
            System.out.println("[S]...................Sair");
            char resposta = Character.toUpperCase(scanner.nextLine().charAt(0));

            switch (resposta) {
                case 'N':
                    newKey();
                    break;
                case 'P':
                    getKey();
                    break;
                case 'C':
                    criptografar();
                    break;
                case 'D':
                    descriptografar();
                    break;
                case 'S':
                    sair();
                    break;
                default:
                    System.out.println("Respota inválida!");
                    System.out.println();
            }
        }
    }

    private void newKey(){
        caractere = ' '; // Próximo caractere na tabela ASCII (+1)
        lista.clear();
        listaMisturada.clear();

        for(int i = 32; i < 127; i++){
            // Valor do caractere vazio em ASCII é 32
            lista.add(Character.valueOf(caractere));
            caractere++;
        }
        listaMisturada = new ArrayList(lista);
        Collections.shuffle(listaMisturada);
        System.out.println("** Uma nova key foi gerada! **");
    }

    private void getKey(){
        System.out.println("Key: ");
        for (Character x : lista) {
            System.out.print(x);
        }
        System.out.println();
        for (Character x : listaMisturada) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void criptografar(){
        System.out.println("Digite uma mensagem para ser criptografada: ");
        String mensagem = scanner.nextLine();

        letras = mensagem.toCharArray();

        for (int i = 0; i < letras.length; i++){

            for (int j = 0; j < lista.size(); j++) {
                if(letras[i] == lista.get(j)) {
                    letras[i] = listaMisturada.get(j);
                    break;
                }
            }
        }
        System.out.println("Mensagem Criptografada: ");
        for(char x : letras) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void descriptografar(){
        System.out.println("Digite uma mensagem para ser descriptografada: ");
        String mensagem = scanner.nextLine();

        letras = mensagem.toCharArray();

        for (int i = 0; i < letras.length; i++){
            for (int j = 0; j < listaMisturada.size(); j ++) {
                if(letras[i] == listaMisturada.get(j)) {
                    letras[i] = lista.get(j);
                    break;
                }
            }
        }
        System.out.println("Mensagem Descriptografada: ");
        for(char x : letras) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void sair(){
        System.out.println("Obrigado! Até mais :)");
        System.exit(0);
    }

}
