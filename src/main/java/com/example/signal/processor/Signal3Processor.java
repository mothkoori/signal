package com.example.signal.processor;

import com.example.signal.algo.Algo;
import org.springframework.stereotype.Service;

@Service
public class Signal3Processor implements SignalProcessor{
    @Override
    public void processSignal(Algo algo) {
        algo.setAlgoParam(1,90);
        algo.setAlgoParam(2,15);
        algo.performCalc();
        algo.submitToMarket();
    }
}
