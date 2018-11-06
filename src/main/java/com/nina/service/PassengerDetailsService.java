package com.nina.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import com.nina.pojo.PassengerTO;

@Configuration
public class PassengerDetailsService {
	
	public List<PassengerTO> getPaxInfo(String pnrNumber){
		
		PassengerTO pax1 = new PassengerTO();
		pax1.setFirstName("Naveen");
		pax1.setLastName("MS");
		pax1.setPassengerNumber("1");
		pax1.setPnr("MNQ2TR");
		
		PassengerTO pax2 = new PassengerTO();
		pax2.setFirstName("Niranjan");
		pax2.setLastName("MS");
		pax2.setPassengerNumber("2");
		pax2.setPnr("MNQ2TR");
		
		List<PassengerTO> paxInfo = new ArrayList<PassengerTO>();
		paxInfo.add(pax1);
		paxInfo.add(pax2);
		
		return paxInfo;
		
		
	}

}
