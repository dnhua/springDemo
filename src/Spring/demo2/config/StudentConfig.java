package Spring.demo2.config;

import Spring.demo2.Person;
import Spring.demo2.Student2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    public Person student2() {
        return new Student2();
    }
}
