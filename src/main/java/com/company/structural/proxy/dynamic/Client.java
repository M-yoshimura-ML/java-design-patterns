package com.company.structural.proxy.dynamic;

import com.company.structural.proxy.Image;
import com.company.structural.proxy.Point2D;

public class Client {
    public static void main(String[] args) {
        Image image = ImageFactory.getImage("MyPic.bmp");
        image.setLocation(new Point2D(10, 10));
        System.out.println("Image location: " + image.getLocation());
        System.out.println("Starting render...");
        image.render();
    }
}
