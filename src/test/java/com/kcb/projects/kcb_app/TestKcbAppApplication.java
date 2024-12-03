package com.kcb.projects.kcb_app;

import org.springframework.boot.SpringApplication;

public class TestKcbAppApplication {

	public static void main(String[] args) {
		SpringApplication.from(KcbAppApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
