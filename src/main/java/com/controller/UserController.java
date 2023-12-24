//package com.controller;
//
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.entity.TxSellHdr;
//import com.entity.master.MsUser;
//import com.service.TxSellHdrService;
//import com.service.master.MsUserService;
//
//@Controller
//public class UserController {
//	
//	@Autowired
//	MsUserService msUserSvc;
//	
//	@GetMapping({ "/user"})
//    public String getData(Model model){
//		try {
//			
//			List<MsUser> data = msUserSvc.findAll();
//	        model.addAttribute("data", data);
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//        return "user";
//    }
//	
////	@PostMapping({ "/penjualan"})
////    public String getDataInsert(@RequestParam Map<String,Object> map){
////		try {
////			
////			System.out.println("++++++++++++");
////			System.out.println(map.get("customerName").toString());
////			
////		}catch(Exception e) {
////			e.printStackTrace();
////		}
////        return "penjualan";
////    }
//
//}
