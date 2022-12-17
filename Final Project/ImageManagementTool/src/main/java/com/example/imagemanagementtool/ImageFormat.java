package com.example.imagemanagementtool;

import java.io.IOException;

public interface ImageFormat {
    void convert(String imageName) throws IOException;
}
