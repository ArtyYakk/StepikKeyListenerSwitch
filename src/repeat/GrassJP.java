package repeat;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GrassJP extends JPanel {
    BufferedImage image;
    Image newImage;

    GrassJP(BufferedImage image){
        this.image = image;
        newImage = image.getScaledInstance(50,50,Image.SCALE_DEFAULT);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int i=0; i<800; i+=50){
            for(int j=0; j<600; j+=50){
                g.drawImage(newImage,i,j,this);
            }
        }

    }
}
