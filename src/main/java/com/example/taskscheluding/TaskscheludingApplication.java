package com.example.taskscheluding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class TaskscheludingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskscheludingApplication.class, args);
    }

}
