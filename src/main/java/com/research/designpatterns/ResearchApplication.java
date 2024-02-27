package com.research.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.research.designpatterns.factory.Car;
import com.research.designpatterns.factory.Golf;
import com.research.designpatterns.factory.Polo;
import com.research.designpatterns.factory.VolkswagenFactory;
import com.research.designpatterns.singleton.Singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class ResearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResearchApplication.class, args);


		testSingleton();
		testFactoryMethod();

	}

	static void testSingleton() {
		final Singleton singleton = Singleton.getInstance();
		log.atInfo().log(singleton.getMessage());
	}

	static void testFactoryMethod() {
		VolkswagenFactory volkswagenFactory = new VolkswagenFactory();

		final Car polo =  volkswagenFactory.createCar("polo");
		polo.displayCar();
		final Car golf =  volkswagenFactory.createCar("golf");
		golf.displayCar();

		assert polo instanceof Polo;
		assert golf instanceof Golf;
	}

}
