package com.company.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Message msg = new TextMessage("The <FORCE> is strong with this one!");
        System.out.println(msg.getContent());

        Message decorator = new HtmlEncodedMessage(msg);
        System.out.println(decorator.getContent());

        decorator = new Base64EncodedMessage(decorator);
        System.out.println(decorator.getContent());
    }
}
