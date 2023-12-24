package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dto.MsUserDto;

@Controller
public class AuthController {
	


	@GetMapping({ "/", "/login" })
    public String login(){
        return "login";
    }
	
	@GetMapping("/index")
    public String home(){
        return "index";
    }
	
	@PostMapping({"/login" })
   public String loginApp(@ModelAttribute("user") MsUserDto dto){
		
		boolean isValid = true;
		// try {
		// 	String username = dto.getUsername();
		// 	String password = dto.getPassword();
			
		// 	MsUserDto dto2 = msUserSvc.findOne(username, password);
			
		// 	if(dto2.getUsername()!=null) {
		// 		isValid = true;
		// 	}
			
		// }catch(Exception e) {
		// 	e.printStackTrace();
		// }

		System.out.println("hu "+dto.getUsername());
		if(isValid) {
	        return "dashboard";			
		}
       return "login";
		
   }
	
	@GetMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }

}
