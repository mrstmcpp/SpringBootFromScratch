package org.mrstm.springboot;

import org.mrstm.springboot.jpaLearning.Todo;
import org.mrstm.springboot.jpaLearning.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(TodoRepository repo) {
        return args -> {
            repo.save(new Todo(null, "First Todo"));
            repo.save(new Todo(null, "Another Todo"));
        };
    }

}
