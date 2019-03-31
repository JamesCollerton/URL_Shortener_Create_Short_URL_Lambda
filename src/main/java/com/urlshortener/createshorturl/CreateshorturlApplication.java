package com.urlshortener.createshorturl;

import com.urlshortener.createshorturl.controllers.LambdaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ LambdaController.class })
public class CreateshorturlApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CreateshorturlApplication.class, args);
	}

}
