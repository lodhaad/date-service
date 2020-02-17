package com.tradeai.dateservices.dto;




import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class ProcessingDateDTO {
	

	private Date systemProcessingDate;
	private Date securityPriceDate;
	private String region;
	private String active;
	

}
