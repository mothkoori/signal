package com.example.signal.processor;

import com.example.signal.SignalEnum;
import com.example.signal.algo.Algo;
import org.springframework.stereotype.Service;

/**
 * This is Default signal processor.
 * This will be used when there is no specific signal processor for received signal code.
 */
@Service
public class DefaultSignalProcessor extends BaseSignalProcessor{

    DefaultSignalProcessor() {
        super(SignalEnum.DEFAULT);
    }
    @Override
    public void processSignal(Algo algo) {
        algo.cancelTrades();
    }
}
