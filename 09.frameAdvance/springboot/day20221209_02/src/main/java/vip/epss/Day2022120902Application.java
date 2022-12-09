package vip.epss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import vip.epss.controller.AdminController;

@SpringBootApplication
public class Day2022120902Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Day2022120902Application.class, args);
		AdminController adminController = run.getBean("adminController", AdminController.class);
		adminController.test01();
	}

}
