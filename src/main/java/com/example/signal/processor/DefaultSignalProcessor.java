package com.example.signal.processor;

import com.example.signal.algo.Algo;
import org.springframework.stereotype.Service;

@Service
public class DefaultSignalProcessor implements SignalProcessor{
    @Override
    public void processSignal(Algo algo) {
        algo.cancelTrades();
    }
}
