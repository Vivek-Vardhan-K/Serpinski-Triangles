package com.triangle.serpinski;

import com.triangle.serpinski.canvas.MyFrame;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SerpinskiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(SerpinskiApplication.class);
		builder.headless(false);
		ConfigurableApplicationContext context = builder.run(args);
	}

	@Override
	public void run(String... args) {
		MyFrame mf=new MyFrame();
		System.out.println("Hello world");
	}
}
