package com.company.creational.factorymethod;

import com.company.creational.factorymethod.message.Message;
import com.company.creational.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {


    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
