package com.company.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ErrorMessageFactory {
    public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError}

    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

    public static ErrorMessageFactory getInstance() {
        return FACTORY;
    }

    private Map<ErrorType, SystemErrorMessage> errorMessage = new HashMap<>();

    private ErrorMessageFactory() {
        String messageTemplate = "A generic error of type $errorCode occurred. pls refer to:\n";
        String messageTemplate2 = "A page not found. type $errorCode occurred. pls refer to:\n";
        errorMessage.put(ErrorType.GenericSystemError,
                new SystemErrorMessage(messageTemplate, "http://google.com/q="));
        errorMessage.put(ErrorType.PageNotFoundError,
                new SystemErrorMessage(messageTemplate2, "http://google.com/q="));
    }

    public SystemErrorMessage getError(ErrorType type) {
        return errorMessage.get(type);
    }

    public UserBannedErrorMessage getUserBannedMessage(String caseId) {
        return new UserBannedErrorMessage(caseId);
    }
}
