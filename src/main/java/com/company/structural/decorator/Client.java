package com.company.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Message msg = new TextMessage("The <FORCE> is strong with this one!");
        System.out.println(msg.getContent());
    }
}
