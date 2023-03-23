package com.example.signal;

/**
 * Enum to hold signal values all at one place.
 */
public enum SignalEnum {
    ONE(1),
    TWO(2),
    THREE(3),
    DEFAULT(0);

    private Integer signal;

    private SignalEnum(Integer signal) {
        this.signal = signal;
    }
    public Integer getSignal(){
        return signal;
    }
}
