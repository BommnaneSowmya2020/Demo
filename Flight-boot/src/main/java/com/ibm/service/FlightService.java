package com.ibm.service;

import com.ibm.entity.Flight;
import java.util.List;
public interface FlightService {

	
	void save(Flight f);
	
	Flight fetch(int code);
	
	List<Flight> list();
	
	void delete(int code);
	
	List<Flight> byCarrier(String carrier);
	
	List<Flight> byRoute(String source,String destiny);
}