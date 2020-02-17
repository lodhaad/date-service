package com.tradeai.dateservices.datamodel;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

@Entity
@Table (name ="system_processing_date" , schema = "ref_data")
public class ProcessingDate {
	
	
	@Id
	@Column(name="system_processing_date")
	private Date systemProcessingDate;
	
	@Column(name="sec_price_date")
	private Date securityPriceDate;
	
	@Column(name="region")
	private String region;
	
	@Column(name="active")
	private String active;
	


}
