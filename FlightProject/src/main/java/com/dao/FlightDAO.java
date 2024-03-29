package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.flightPackage.*;

@Repository
public interface FlightDAO
{
	public void addFlight(Flight flight);
	public Flight findFlight(int id);
	public List<Flight> findAllFlight();
	public boolean modifyFlight(Flight flight);
	public boolean deleteFlight(Flight flight);
}
