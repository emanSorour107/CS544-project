package com.cs5446.tm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TmApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmApplication.class, args);
		// Test
	}

	@RestController
	public class MyController {
        @GetMapping("/")
        public String test() {
            return "working";
        }
    }

}
