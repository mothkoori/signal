package com.example.signal.processor;

import com.example.signal.SignalEnum;
import com.example.signal.algo.Algo;
import org.springframework.stereotype.Service;

/**
 * This class has methods to process the Signal 1.
 */
@Service
public class Signal1Processor extends BaseSignalProcessor{
    Signal1Processor() {
        super(SignalEnum.ONE);
    }
    @Override
    public void processSignal(Algo algo) {
        algo.setUp();
        algo.setAlgoParam(1,60);
        algo.performCalc();
        algo.submitToMarket();
    }
}
