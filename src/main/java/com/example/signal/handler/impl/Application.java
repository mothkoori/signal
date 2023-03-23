package com.example.signal.handler.impl;

import com.example.signal.algo.Algo;
import com.example.signal.algo.handler.api.SignalHandler;
import com.example.signal.processor.SignalProcessor;
import com.example.signal.processor.factory.SignalProcessorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Application implements SignalHandler {

    @Autowired
    SignalProcessorFactory factory;
    @Override
    public void handleSignal(int signal) {
        Algo algo = new Algo();
        SignalProcessor signalProcessor = factory.getSignalProcessor(signal);
        signalProcessor.processSignal(algo);
        algo.doAlgo();
    }
}
