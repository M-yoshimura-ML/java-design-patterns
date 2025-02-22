package com.company.structural.proxy.dynamic;

import com.company.structural.proxy.BitmapImage;
import com.company.structural.proxy.Image;
import com.company.structural.proxy.Point2D;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ImageInvocationHandler implements InvocationHandler {
    private String filename;
    private Point2D location;
    private BitmapImage image;
    private static final Method setLocationMethod;
    private static final Method getLocationMethod;
    private static final Method renderMethod;

    static {
        try {
            setLocationMethod = Image.class.getMethod("setLocation", new Class[]{Point2D.class});
            getLocationMethod = Image.class.getMethod("getLocation", null);
            renderMethod = Image.class.getMethod("render", null);
        } catch (NoSuchMethodException e) {
            throw new NoSuchMethodError(e.getMessage());
        }
    }

    public ImageInvocationHandler(String filename) {
        this.filename = filename;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Invoking method:" + method.getName());
        if (method.equals(setLocationMethod)) {
            return handleSetLocation(args);
        } else if (method.equals(getLocationMethod)) {
            return handleGetLocation();
        } else if (method.equals(renderMethod)) {
            return handleRender();
        }
        return null;
    }

    private Object handleRender() {
        if (image == null) {
            image = new BitmapImage(filename);
        }
        image.render();
        return null;
    }

    private Point2D handleGetLocation() {
        if (image != null) {
            return image.getLocation();
        } else {
            return this.location;
        }
    }

    private Object handleSetLocation(Object[] args) {
        if (image != null) {
            image.setLocation((Point2D) args[0]);
        } else {
            this.location = (Point2D) args[0];
        }
        return null;
    }
}
