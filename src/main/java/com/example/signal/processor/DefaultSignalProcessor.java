package com.example.signal.processor;

import com.example.signal.SignalEnum;
import com.example.signal.algo.Algo;
import org.springframework.stereotype.Service;

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
