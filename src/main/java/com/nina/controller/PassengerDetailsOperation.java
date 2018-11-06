package com.nina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nina.pojo.PassengerTO;
import com.nina.service.PassengerDetailsService;

@RestController
public class PassengerDetailsOperation {
	
	@Autowired
	PassengerDetailsService passengerService;
	
	@GetMapping("/rest/getPaxInfo/{pnrNumber}")
	public List<PassengerTO> getPassengerDetails(@PathVariable(value="pnrNumber")String pnrNumber){
		
		if(StringUtils.isEmpty(pnrNumber)){
			return null;
		}else{
			return passengerService.getPaxInfo(pnrNumber);
		}
	}

}
