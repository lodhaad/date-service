package com.tradeai.dateservices.response;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProcessingDateResponse {
	
	private String systemProcessingDate;
	private String securityPriceDate;
	private String region;
	private String active;

}
