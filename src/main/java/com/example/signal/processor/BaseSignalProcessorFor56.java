package com.example.signal.processor;

import com.example.signal.SignalEnum;
import com.example.signal.algo.Algo;

/**
 * This class has logic common to 5, 6 signals. we can enhance this class in the future.
 */
public abstract class BaseSignalProcessorFor56 extends BaseSignalProcessor{
    BaseSignalProcessorFor56(SignalEnum signal) {
        super(signal);
    }

    /**
     * This method is used to implement specific task needs to be done for respective signal code.
     * @param algo
     */
    public abstract void doSpecificTasks(Algo algo);

    @Override
    public void processSignal(Algo algo) {
        doSpecificTasks(algo);
        algo.submitToMarket();
    }
}
