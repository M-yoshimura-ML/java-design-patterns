package com.company.factorymethod;

import com.company.factorymethod.message.JSONMessage;
import com.company.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {


    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
