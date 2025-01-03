package com.company.creational.factorymethod;

import com.company.creational.factorymethod.message.JSONMessage;
import com.company.creational.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {


    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
