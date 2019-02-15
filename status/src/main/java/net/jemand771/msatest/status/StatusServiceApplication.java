package net.jemand771.msatest.status;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StatusServiceApplication {

    @GetMapping(value = "/")
    public String getStatus() {
        return "working, yay!";
    }

    public static void main(String[] args) {
        SpringApplication.run(StatusServiceApplication.class, args);
    }
}
