package com.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.designpatterns.adapter.Minivan;
import com.designpatterns.decorator.Mozzarella;
import com.designpatterns.decorator.Pizza;
import com.designpatterns.decorator.PlainPizza;
import com.designpatterns.decorator.TomatoSauce;
import com.designpatterns.factory.Golf;
import com.designpatterns.factory.VolkswagenFactory;
import com.designpatterns.strategy.Boat;
import com.designpatterns.strategy.CargoPlane;
import com.designpatterns.template.Sandwich;
import com.designpatterns.template.VegetarianSandwich;
import com.designpatterns.adapter.Helicopter;
import com.designpatterns.adapter.HelicopterAdapter;
import com.designpatterns.adapter.Vehicle;
import com.designpatterns.factory.Car;
import com.designpatterns.factory.Polo;
import com.designpatterns.singleton.Singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		log.atInfo().log("---------- singleton pattern ----------");
		testSingleton();
		log.atInfo().log("---------- factory pattern ----------");
		testFactoryMethod();
		log.atInfo().log("---------- adapter pattern ----------");
		testAdapter();
		log.atInfo().log("---------- strategy pattern ----------");
		testStrategyPattern();
		log.atInfo().log("---------- decorator pattern ----------");
		testDecoratorPattern();
		log.atInfo().log("---------- template pattern ----------");
		testTemplatePattern();
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

	static void testAdapter() {

		Minivan minivan = new Minivan();
		Helicopter helicopter = new Helicopter();
		Vehicle helicopterAdapter = new HelicopterAdapter(helicopter);


		log.atInfo().log("Helicopter");
		helicopter.assignPilot("pilot");
		helicopter.openHatch();
		helicopter.flyUp();

		log.atInfo().log("Minivan");
		minivan.assignDriver("Driver");
		minivan.openDoors();
		minivan.driveForward();

		log.atInfo().log("HelicopterAdapter");
		helicopterAdapter.assignDriver("pilot");
		helicopterAdapter.driveForward();
		helicopterAdapter.openDoors();
	}

	static void testStrategyPattern() {
		Boat boat = new Boat();
		CargoPlane plane = new CargoPlane();

		log.atInfo().log("The boat {}", boat.tryingToFly());
		log.atInfo().log("The plane {}", plane.tryingToFly());
	}

	static void testDecoratorPattern() {
		final Pizza pizza = new Mozzarella(new TomatoSauce(new PlainPizza()));
		log.atInfo().log(pizza.getDescription());
	}

	static void testTemplatePattern() {
		Sandwich vegetableSandwich = new VegetarianSandwich();
		vegetableSandwich.makeSandwich();
	}


}
