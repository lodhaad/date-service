package com.tradeai.dateservices.data;

import java.sql.Date;

import org.springframework.data.repository.CrudRepository;

import com.tradeai.dateservices.datamodel.ProcessingDate;

public interface ProcessingDateRepository extends CrudRepository<ProcessingDate, Date> {
	
	public ProcessingDate findByActive(String activeString);

}
