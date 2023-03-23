package com.example.signal.processor;

import com.example.signal.algo.Algo;

public interface SignalProcessor {
    void processSignal(Algo algo);

    Integer getSignal();
}
