package com.goit.gojavaonline.module6.task1;


public class TemperatureLimitException extends RuntimeException {
    TemperatureLimitException(String msgText){
        super(msgText);
    }

    public TemperatureLimitException() {

    }
}
