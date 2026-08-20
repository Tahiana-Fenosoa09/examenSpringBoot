package tahiana.examenspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"controller","dao","service","model","tahiana.examenspringboot","connection"})
public class ExamenSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenSpringBootApplication.class, args);
    }

}
