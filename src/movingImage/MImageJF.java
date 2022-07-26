package movingImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MImageJF extends JFrame {
    BufferedImage image;
    private int x = 0;
    private int y = 0;
    MImageJP aa;

    {
        try {
            image = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\keylistener\\pacman.jpg"));
        } catch (IOException e) {
            System.out.println("Ошибка чтения картинки из файла");
        }
    }

    public void init(){
        JFrame frame = new JFrame("Grass");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(815,637));
        frame.setLocation(1100,200);

        aa = new MImageJP(image,x,y);

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);

                switch(e.getKeyCode()){
                    case 40:
                        if(y < 550) y += 50;
                        break;
                    case 38:
                        if(y > 0) y -= 50;
                        break;
                    case 37:
                        if(x > 0) x -= 50;
                        break;
                    case 39:
                        if(x < 750)  x += 50;
                        break;
                }
                aa = new MImageJP(image,x,y);
                frame.getContentPane().add(aa);
                frame.setVisible(true);
                frame.pack();
            }
        });

        frame.getContentPane().add(aa);
        frame.setVisible(true);
        frame.pack();
    }
}
