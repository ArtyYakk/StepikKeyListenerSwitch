package repeat;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GrassJF extends JFrame {
    BufferedImage image;

    {
        try {
            image = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\keylistener\\grass.jpg"));
        } catch (IOException e) {
            System.out.println("Ошибка чтения картинки из файла");
        }
    }


    public void init(){
        JFrame frame = new JFrame("Grass");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(815,637));
        frame.setLocation(1100,200);

        GrassJP aa = new GrassJP(image);

        frame.getContentPane().add(aa);
        frame.setVisible(true);
        frame.pack();
    }
}
