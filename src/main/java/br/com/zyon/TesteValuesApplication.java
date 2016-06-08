package br.com.zyon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = { "classpath:application2.yml" })
@SpringBootApplication
public class TesteValuesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteValuesApplication.class, args);
	}
}
