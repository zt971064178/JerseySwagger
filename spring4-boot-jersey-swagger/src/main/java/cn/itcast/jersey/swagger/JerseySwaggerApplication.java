package cn.itcast.jersey.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class JerseySwaggerApplication {
	public static void main(String[] args) {
		SpringApplication.run(JerseySwaggerApplication.class, args) ;
	}
}
