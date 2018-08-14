package com.luck.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.luck.springboot.listener.SpringBootLIstener;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(App.class);
		// SpringBoot启动监听器
		app.addListeners(new SpringBootLIstener());
		app.run(args);
	}
}
