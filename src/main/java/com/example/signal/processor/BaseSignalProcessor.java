package com.example.signal.processor;

import com.example.signal.SignalEnum;

public abstract class BaseSignalProcessor implements SignalProcessor{
    private final SignalEnum signal;

    BaseSignalProcessor(SignalEnum signal){
        this.signal = signal;
    }
    @Override
     public Integer getSignal(){
        return signal.getSignal();
     }

}
