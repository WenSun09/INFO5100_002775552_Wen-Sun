package com.example.imagemanagementtool;

import java.io.IOException;

// Factory pattern
public class ConvertImage {
    public void convertImage(String imageFormat, String imageName) throws IOException {
        switch (imageFormat) {
            case "jpg":
                new JPG(imageName);
            case "png":
                new PNG(imageName);
        }
    }
}
