package com.company.structural.proxy;


public class BitmapImage implements Image {
    private Point2D location;
    private String name;

    public BitmapImage(String fileName) {
        System.out.println("Loaded from disk: " + fileName);
        this.name = fileName;
    }

    @Override
    public void setLocation(Point2D point2D) {
        this.location = point2D;
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void render() {
        System.out.println("Rendered " + this.name);
    }
}
