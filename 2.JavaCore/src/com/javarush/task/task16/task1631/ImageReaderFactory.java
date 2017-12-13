package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes type) throws IllegalAccessError {
        if (type == ImageTypes.BMP) {
            return new BmpReader();
        } else if (type == ImageTypes.JPG) {
            return new JpgReader();
        } else if (type == ImageTypes.PNG) {
            return new PngReader();
        }
        throw new IllegalArgumentException();
    }
}
