package Spring.demo4.config;

import Spring.demo4.Amusement;
import Spring.demo4.TV;
import Spring.demo4.WatchTV;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "Spring.demo4")
public class TVConfiguration {
    @Bean
    public Amusement watchTV(){
        return new WatchTV();
    }

    @Bean
    public TV tv(){
        return new TV();
    }
}
