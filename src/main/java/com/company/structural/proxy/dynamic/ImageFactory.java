package com.company.structural.proxy.dynamic;

import com.company.structural.proxy.Image;

import java.lang.reflect.Proxy;

public class ImageFactory {
    public static Image getImage(String filename) {
        return (Image) Proxy.newProxyInstance(Client.class.getClassLoader(),
                new Class[]{Image.class},
                new ImageInvocationHandler(filename)
                );
    }
}
