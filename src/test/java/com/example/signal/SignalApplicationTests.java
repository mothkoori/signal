package com.example.signal;

import com.example.signal.processor.DefaultSignalProcessor;
import com.example.signal.processor.Signal1Processor;
import com.example.signal.processor.SignalProcessor;
import com.example.signal.processor.factory.SignalProcessorFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SignalApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Autowired
	SignalProcessorFactory factory;

	@Test
	void testSignal1() {
		ResponseEntity<String> response = restTemplate.exchange("http://localhost:" + port + "/signal/1", HttpMethod.GET,null, String.class);
		assertEquals(200,response.getStatusCode().value());
		assertEquals("handled signal 1",response.getBody());
	}

	@Test
	void testSignal100() {
		ResponseEntity<String> response = restTemplate.exchange("http://localhost:" + port + "/signal/100", HttpMethod.GET,null, String.class);
		assertEquals(200,response.getStatusCode().value());
		assertEquals("handled signal 100",response.getBody());
	}

	@Test
	void testSignalProcessorFactoryWithSignal1() {
		Integer signal = 1;
		SignalProcessor processor = factory.getSignalProcessor(signal);
		assertEquals(processor.getClass(), Signal1Processor.class);
	}
	@Test
	void testSignalProcessorFactoryForDefaultCase() {
		Integer signal = 100;
		SignalProcessor processor = factory.getSignalProcessor(signal);
		assertEquals(processor.getClass(), DefaultSignalProcessor.class);
	}

}
