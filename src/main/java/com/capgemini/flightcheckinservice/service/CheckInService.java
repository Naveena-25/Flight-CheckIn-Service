package com.capgemini.flightcheckinservice.service;

import com.capgemini.flightcheckinservice.entity.CheckIn;

public interface CheckInService {

	public CheckIn getCheckIn(int cId);
	public boolean addCheckIn(CheckIn checkIn);
}
