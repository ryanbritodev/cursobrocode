package Ex064;

import javax.swing.*;
import java.awt.*;

public class Redimensionar {

    public static ImageIcon redimensionar(String caminhoImagem, int largura, int altura) {
        ImageIcon imageIcon = new ImageIcon(caminhoImagem); // Carregando imagem
        Image image = imageIcon.getImage(); // Transformar
        Image newimg = image.getScaledInstance(largura, altura, Image.SCALE_SMOOTH); // Escalando de forma suave
        return new ImageIcon(newimg); // Transformar de volta
    }
}
