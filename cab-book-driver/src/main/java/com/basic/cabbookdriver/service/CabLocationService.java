package com.basic.cabbookdriver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.basic.cabbookdriver.AppConstants.AppConstants;

@Service
public class CabLocationService {

	@Autowired
	private  KafkaTemplate<String, Object>  kafkaTemplate;
	public Boolean updateLocation(String location) {
		 kafkaTemplate.send(AppConstants.CABLOCATION,location);
		 return true;

		
	}

}
