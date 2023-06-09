package com.example.signal.processor;

import com.example.signal.SignalEnum;
import com.example.signal.algo.Algo;
import org.springframework.stereotype.Service;

/**
 * This class has methods to process the Signal 6.
 */
@Service
public class Signal6Processor extends BaseSignalProcessorFor56{

    Signal6Processor() {
        super(SignalEnum.SIX);
    }

    @Override
    public void doSpecificTasks(Algo algo) {
        algo.setAlgoParam(6,100);
        algo.performCalc();
    }
}
