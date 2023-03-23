package com.example.signal.processor;

import com.example.signal.SignalEnum;
import com.example.signal.algo.Algo;
import org.springframework.stereotype.Service;

@Service
public class Signal4Processor extends BaseSignalProcessor{
    Signal4Processor() {
        super(SignalEnum.FOUR);
    }
    @Override
    public void processSignal(Algo algo) {
        algo.setAlgoParam(1,100);
        algo.performCalc();
        algo.submitToMarket();
    }
}
