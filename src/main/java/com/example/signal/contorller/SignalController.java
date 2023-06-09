package com.example.signal.contorller;

import com.example.signal.handler.impl.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignalController {

    @Autowired
    Application application;
    @GetMapping("/signal/{signalId}")
    public ResponseEntity<String> handleSignal(@PathVariable("signalId") Integer signalCode){
        application.handleSignal(signalCode);
        return new ResponseEntity<>("handled signal "+signalCode, HttpStatus.OK);
    }
}
