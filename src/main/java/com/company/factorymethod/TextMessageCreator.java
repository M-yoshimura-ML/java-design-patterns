package com.company.factorymethod;

import com.company.factorymethod.message.Message;
import com.company.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {


    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
