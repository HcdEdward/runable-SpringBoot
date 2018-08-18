package com.example.demo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication()
@ServletComponentScan
@ComponentScan("com.example.*")
public class Demo02Application {
//exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class} 暂时关闭数据源检查
	public static void main(String[] args) {
		SpringApplication.run(Demo02Application.class, args);
	}
}
