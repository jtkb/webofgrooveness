package webofgrooveness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.groovy.model"})
@EnableJpaRepositories(basePackages = {"com.example.groovy.repository"})
@ComponentScan(basePackages = {"com.example"})
public class WebOfGroovenessApplication
{

	public static void main(String[] args) {
		SpringApplication.run(WebOfGroovenessApplication.class, args);
	}
}
