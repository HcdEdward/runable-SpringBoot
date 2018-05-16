package com.example.demo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication()
@ComponentScan("com.example.*")
public class Demo02Application {
//exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class}
	public static void main(String[] args) {
		SpringApplication.run(Demo02Application.class, args);
	}
}
