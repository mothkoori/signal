package com.example.signal.processor;

import com.example.signal.SignalEnum;
import com.example.signal.algo.Algo;
import org.springframework.stereotype.Service;

/**
 * This class has methods to process the Signal 5.
 */
@Service
public class Signal5Processor extends BaseSignalProcessorFor56{

    Signal5Processor() {
        super(SignalEnum.FIVE);
    }

    @Override
    public void doSpecificTasks(Algo algo) {
        algo.setUp();
        algo.setAlgoParam(5,100);
    }
}
