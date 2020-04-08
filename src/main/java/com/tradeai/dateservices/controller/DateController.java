package com.tradeai.dateservices.controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tradeai.dateservices.dto.ProcessingDateDTO;
import com.tradeai.dateservices.response.ProcessingDateResponse;
import com.tradeai.dateservices.service.ProcessingDateService;



@RestController
@RequestMapping("/processing-date")
public class DateController {
	
	@Autowired 
	private ProcessingDateService service;
	
	@GetMapping( path="/current" )
	public ResponseEntity<ProcessingDateResponse> getCurrentProcessingDate ( ) {
		
		ProcessingDateDTO dto = service.getCurrentProcessingDate();
		
		ProcessingDateResponse response = convert(dto);
		
		return new ResponseEntity<ProcessingDateResponse>(response, HttpStatus.OK);
		
	}


	private ProcessingDateResponse convert(ProcessingDateDTO dto) {

		ProcessingDateResponse response = new ProcessingDateResponse();
		
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		response.setSystemProcessingDate(formater.format(dto.getSystemProcessingDate()));
		response.setSecurityPriceDate(formater.format(dto.getSecurityPriceDate()));
		response.setRegion(dto.getRegion());
		response.setActive(dto.getActive());
		return response;
	}

}
