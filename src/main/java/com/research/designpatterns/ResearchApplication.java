package com.research.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.research.designpatterns.singleton.Singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class ResearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResearchApplication.class, args);

		final Singleton singleton = Singleton.getInstance();
		log.atInfo().log(singleton.getMessage());
	}

}
