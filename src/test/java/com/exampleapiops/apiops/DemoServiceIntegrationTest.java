package com.exampleapiops.apiops;

import com.exampleapiops.apiops.service.DemoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DemoServiceIntegrationTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void testGetMessage() {
        String message = demoService.getMessage();
        assertEquals("Hello, World!", message);
    }
}

