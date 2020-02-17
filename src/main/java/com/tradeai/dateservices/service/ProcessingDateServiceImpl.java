package com.tradeai.dateservices.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tradeai.dateservices.data.ProcessingDateRepository;
import com.tradeai.dateservices.datamodel.ProcessingDate;
import com.tradeai.dateservices.dto.ProcessingDateDTO;

@Service
public class ProcessingDateServiceImpl implements ProcessingDateService {
	
	@Autowired
	private ProcessingDateRepository repository;

	@Override
	public ProcessingDateDTO getCurrentProcessingDate() {

		ProcessingDate processingDate = repository.findByActive("Y");

		ProcessingDateDTO dto = extractDTO(processingDate);

		return dto;
	}
	
	private ProcessingDateDTO extractDTO(ProcessingDate date) {
		
		ProcessingDateDTO dto = new ProcessingDateDTO();
		
		dto.setSystemProcessingDate(new Date(date.getSystemProcessingDate().getTime()));
		dto.setSecurityPriceDate(new Date(date.getSecurityPriceDate().getTime()));
		dto.setRegion(date.getRegion());
		dto.setActive(date.getActive());
		
		return dto;
		
	}

}
