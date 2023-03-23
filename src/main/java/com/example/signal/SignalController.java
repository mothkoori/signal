package com.example.signal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignalController {

    @GetMapping("/signal/{signalId}")
    public String handleSignal(@PathVariable("signalId") Integer signalCode){
        return "handled "+signalCode;
    }
}
