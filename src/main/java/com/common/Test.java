package com.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource({
    "classpath:application.properties",
    "classpath:message.properties"
})
public class Test {
	
	@Value("${jwt.secret}")
	private static String secret;
	
	@Value("${jwt.expirationMs}")
	private int jwtExpirationMs;

	public static void main(String[] args) {
		
		System.out.println(" "+secret);
		Test test = new Test();
		test.test();
		
	}
	
	public String test() {
		System.out.println("test1 "+secret);
		return secret;
	}

}
