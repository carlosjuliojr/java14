package com.julio.app.pooexeptions;

public class DivitionByZeroNoAllowedException extends Exception {
    public DivitionByZeroNoAllowedException(String divisionByZeroNotAllowed) {
        super(divisionByZeroNotAllowed);
    }
}
