package com.example.imagemanagementtool;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyImage {
    private String imageName;
    private BufferedImage thumbnail;
    private String width;
    private String height;

    public MyImage(File file) throws IOException {
        try {
            // read image from file
            BufferedImage image = ImageIO.read(file);

            // save image to local
            imageName = file.getName();
            File localFile = new File(imageName);
            ImageIO.write(image, getImageFormat(), localFile);

            // get width and height
            width = String.valueOf(image.getWidth());
            height = String.valueOf(image.getHeight());

            // resize to a thumbnail
            Image resizedImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            thumbnail = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = thumbnail.createGraphics();
            g2d.drawImage(resizedImage, 0, 0, null);
            g2d.dispose();
        } catch (Exception e) {
            throw e;
        }
    }

    public String getImageName() {
        return imageName;
    }

    public BufferedImage getThumbnail() {
        return thumbnail;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public String getImageFormat() {
        String imageFormat = "jpg";
        int index = imageName.lastIndexOf('.');
        if(index > 0) {
            imageFormat = imageName.substring(index + 1);
        }
        return imageFormat;
    }

    public void convertFormat(String formatName) throws IOException {
        // convert image using Factory Pattern
        ConvertImage convImage = new ConvertImage();
        convImage.convertImage(formatName, imageName);

        // update image name
        int index = imageName.lastIndexOf('.');
        String name = imageName.substring(0, index);
        imageName = name + "." + formatName;
    }
}
