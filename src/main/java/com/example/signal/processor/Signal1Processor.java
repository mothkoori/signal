package com.example.signal.processor;

import com.example.signal.algo.Algo;
import org.springframework.stereotype.Service;

@Service
public class Signal1Processor implements SignalProcessor{
    @Override
    public void processSignal(Algo algo) {
        algo.setUp();
        algo.setAlgoParam(1,60);
        algo.performCalc();
        algo.submitToMarket();
    }
}
