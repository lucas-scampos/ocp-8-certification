package com.certification.exceptions_and_assertions;

public class CannotSwimException extends Exception {
    public CannotSwimException() {
        super();
    }

    public CannotSwimException(Exception e) {
        super(e);
    }

    public CannotSwimException(String message) {
        super(message);
    }
}
