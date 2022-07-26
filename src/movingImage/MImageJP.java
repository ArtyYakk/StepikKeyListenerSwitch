package movingImage;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MImageJP extends JPanel {
    BufferedImage image;
    Image newImage;
    private final int x;
    private final int y;

    MImageJP(BufferedImage image, int x, int y){
        this.image = image;
        newImage = image.getScaledInstance(50,50,Image.SCALE_DEFAULT);
        this.x = x;
        this.y = y;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(newImage,x,y,this);
    }
}
