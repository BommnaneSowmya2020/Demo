package com.ibm.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ibm.entity.Flight;
import com.ibm.repo.FlightRepository;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestFlight {
	@Autowired
	private FlightRepository repo;

	@Test
	public void testSave() {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");

		//FlightRepository repo = (FlightRepository) ctx.getBean("repo");
		Flight f = new Flight();
		f.setCode(1237);
		f.setCarrier("Air Indigo");
		f.setSource("Banglore");
		f.setDestiny("Delhi");
		repo.save(f);

	}

	@Test
	public void testFetch() {
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");

		// FlightRepository repo = (FlightRepository) ctx.getBean("repo");
		Flight f = repo.fetch(1237);
		System.out.println(f.getCarrier() + "," + f.getSource() + "," + f.getDestiny());

	}

	@Test
	public void testFetchAll() {
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		// FlightRepository repo = (FlightRepository) ctx.getBean("repo");

		List<Flight> list = repo.fetchAll();
		for (Flight flight : list) {
			System.out.println(flight.getCode() + "," + flight.getCarrier() + "-" + flight.getSource() + "-"
					+ flight.getDestiny());
		}

	}

	@Test
	public void testFetchByRoute() {
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		// FlightRepository repo = (FlightRepository) ctx.getBean("repo");

		List<Flight> flight = repo.fetchByRoute("Hyderabad", "Delhi");
		flight.forEach(System.out::println);

	}

	@Test
	public void testRemove() {
		repo.remove(1236);
	}

	@Test
	public void testUpdate() {
		Flight f = new Flight();
		f.setCarrier("Jet Airways");
		f.setCode(1238);
		f.setSource("Mumbai");
		f.setDestiny("Goa");
		repo.update(f);
	}
}
