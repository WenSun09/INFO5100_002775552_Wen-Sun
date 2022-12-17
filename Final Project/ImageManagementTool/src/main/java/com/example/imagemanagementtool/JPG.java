package com.example.imagemanagementtool;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JPG implements ImageFormat{
    public JPG(String imageName) throws IOException {
        convert(imageName);
    }

    @Override
    public void convert(String imageName) throws IOException {
        // read original image
        File imageFile = new File(imageName);
        BufferedImage image = ImageIO.read(imageFile);

        // convert image and save to local
        int index = imageName.lastIndexOf('.');
        String name = imageName.substring(0, index);
        String newImageName = name + ".jpg";
        File newImageFile = new File(newImageName);
        ImageIO.write(image, "jpg", newImageFile);
    }
}
