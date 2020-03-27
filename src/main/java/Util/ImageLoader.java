package main.java.Util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

    private static ImageLoader ourInstance = new ImageLoader();

    public static ImageLoader getInstance() {
        return ourInstance;
    }

    public BufferedImage loadImage(String imageName) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(Urls.createUrls("default").getProperty("RESOURCE_URL") + imageName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
}
