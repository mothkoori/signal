package com.example.signal.processor.factory;

import com.example.signal.processor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * This Factory class produces the signal processors based on signal.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SignalProcessorFactory {

    @Autowired
    Signal1Processor signal1Processor;
    @Autowired
    Signal2Processor signal2Processor;
    @Autowired
    Signal3Processor signal3Processor;

    @Autowired
    DefaultSignalProcessor defaultSignalProcessor;

    /**
     * This method is used to signal processor based on the signal.
     * @param signal
     * @return
     */
    public SignalProcessor getSignalProcessor(Integer signal) {
        switch (signal) {
            case 1:
                return signal1Processor;
            case 2:
                return signal2Processor;
            case 3:
                return signal3Processor;
            default:
                return defaultSignalProcessor;
        }
    }
}
