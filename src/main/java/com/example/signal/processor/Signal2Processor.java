package com.example.signal.processor;

import com.example.signal.SignalEnum;
import com.example.signal.algo.Algo;
import org.springframework.stereotype.Service;

/**
 * This class has methods to process the Signal 2.
 */
@Service
public class Signal2Processor extends BaseSignalProcessor{

    Signal2Processor() {
        super(SignalEnum.TWO);
    }
    @Override
    public void processSignal(Algo algo) {
        algo.reverse();
        algo.setAlgoParam(1,80);
        algo.submitToMarket();
    }
}
