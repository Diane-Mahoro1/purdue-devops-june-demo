package com.edureka.purdue_devops_june_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@restController
public class PurdueDevopsJuneDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurdueDevopsJuneDemoApplication.class, args);

		@GetMapping("/")
		public String hello() {
		  return String.format("Hello welcome to my website");
		}	}

}
