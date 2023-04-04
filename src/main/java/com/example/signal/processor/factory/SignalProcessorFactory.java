package com.example.signal.processor.factory;

import com.example.signal.SignalEnum;
import com.example.signal.DuplicateSignalProcessor;
import com.example.signal.processor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This Factory class produces the signal processors based on signal.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SignalProcessorFactory {

    private Map<Integer,SignalProcessor> signalProcessorMap = new HashMap<>();

    @Autowired
    SignalProcessorFactory(List<SignalProcessor> signalProcessors) throws Exception {
        for(SignalProcessor signalProcessor : signalProcessors){
            if(signalProcessorMap.get(signalProcessor.getSignal()) != null){
                throw new DuplicateSignalProcessor("Duplicate signal processor defined for signal "+signalProcessor.getSignal());
            }
            signalProcessorMap.put(signalProcessor.getSignal(),signalProcessor);
        }
    }

    /**
     * This method is used to signal processor based on the signal.
     * @param signal
     * @return
     */
    public SignalProcessor getSignalProcessor(Integer signal) {
        SignalProcessor signalProcessor = signalProcessorMap.get(signal);
        if(signalProcessor == null){
            signalProcessor = signalProcessorMap.get(SignalEnum.DEFAULT.getSignal());
        }
        return signalProcessor;
    }
}
