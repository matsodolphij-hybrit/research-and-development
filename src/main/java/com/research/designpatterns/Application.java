package com.research.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.research.designpatterns.adapter.Helicopter;
import com.research.designpatterns.adapter.HelicopterAdapter;
import com.research.designpatterns.adapter.Minivan;
import com.research.designpatterns.adapter.Vehicle;
import com.research.designpatterns.decorator.Mozzarella;
import com.research.designpatterns.decorator.Pizza;
import com.research.designpatterns.decorator.PlainPizza;
import com.research.designpatterns.decorator.TomatoSauce;
import com.research.designpatterns.factory.Car;
import com.research.designpatterns.factory.Golf;
import com.research.designpatterns.factory.Polo;
import com.research.designpatterns.factory.VolkswagenFactory;
import com.research.designpatterns.singleton.Singleton;
import com.research.designpatterns.strategy.Boat;
import com.research.designpatterns.strategy.CargoPlane;
import com.research.designpatterns.template.Sandwich;
import com.research.designpatterns.template.VegetarianSandwich;

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
