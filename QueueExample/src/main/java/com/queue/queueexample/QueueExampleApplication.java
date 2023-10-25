package com.queue.queueexample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.queue.queueexample")
public class QueueExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueueExampleApplication.class, args);
	}

}
