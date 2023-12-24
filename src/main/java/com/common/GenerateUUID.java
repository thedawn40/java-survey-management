package com.common;

import java.util.UUID;


public class GenerateUUID {
	
	public String generateUuid() {
		UUID randomUUID = UUID.randomUUID();
		
		return randomUUID.toString();

	}
	
	public String generateUuid(String param) {
		UUID randomUUID = UUID.randomUUID();
		
		return param+randomUUID.toString();

	}


}
