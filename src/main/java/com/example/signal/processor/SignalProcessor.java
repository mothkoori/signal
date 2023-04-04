package com.example.signal.processor;

import com.example.signal.algo.Algo;

/**
 * This interface has methods to handle the signal and get signal code.
 */
public interface SignalProcessor {
    /**
     * This method is used to process the signal.
     * @param algo
     */
    void processSignal(Algo algo);

    Integer getSignal();
}
