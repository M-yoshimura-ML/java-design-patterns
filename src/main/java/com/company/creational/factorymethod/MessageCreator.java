package com.company.creational.factorymethod;

import com.company.creational.factorymethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

    public Message getMessage() {
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();

        return msg;
    }

    //Factory Method
    public abstract Message createMessage();

	
}
