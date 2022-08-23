package com.k8s;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8sExampleApplication {

	@Autowired
	private Environment environment;

	@GetMapping("/")
	public String displayMessage(HttpServletRequest request) {

		return "Your application version is " + environment.getProperty("version");

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sExampleApplication.class, args);

	}

}
