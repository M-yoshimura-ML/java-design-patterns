package com.company.creational.abstractfactory2;

import com.company.creational.abstractfactory2.aws.AwsResourceFactory;
import com.company.creational.abstractfactory2.gcp.GoogleResourceFactory;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Client {
    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity cap, int storageMib) {
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) throws Exception{
    	Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.micro, 20480);
        i1.start();
        i1.stop();

        Client gcp = new Client(new GoogleResourceFactory());
        Instance i2 = gcp.createServer(Instance.Capacity.large, 408000);
        i2.start();
        i2.stop();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        System.out.println("Using factory class: " + factory.getClass());

        DocumentBuilder builder = factory.newDocumentBuilder();
        System.out.println("Got builder class: " + builder.getClass());

        Document doc = builder.newDocument();
        System.out.println("Got Document class: " + doc.getClass());

    }

}
