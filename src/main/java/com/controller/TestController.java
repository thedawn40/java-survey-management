//package com.controller;
//
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.util.MultiValueMap;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.dao.master.MsUserDao;
//import com.dto.TxSellDtlDto;
//import com.dto.TxSellHdrDto;
//import com.dto.master.MsUserDto;
//import com.entity.master.MsUser;
//import com.service.TxSellHdrService;
//import com.service.master.MsUserService;
//
//
//@RestController
//@RequestMapping("/api")
//public class TestController {
//	
//	@Autowired
//	TxSellHdrService txSellHdrSvc;
//
//	@Autowired
//	MsUserService msUserSvc;
//	
//	@PostMapping(value= "/penjualan")
//    public String getDataInsert(@RequestBody Map<String, Object>  map){
//		try {
//			
//			System.out.println("++++++++++++");
//			System.out.println(map.get("customerName"));
//			System.out.println(map.get("detail"));
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//        return "penjualan";
//    }
//	
//	@PostMapping(value= "/penjualan2")
//    public String getDataInsert(@RequestBody TxSellHdrDto map){
//		try {
//			
//			System.out.println("++++++++++++");
//			System.out.println(map.getCustomerName());
//			System.out.println(map.getListDetail().get(0).getBrand());
//			txSellHdrSvc.save(map);
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//        return "penjualan";
//    }
//	
//	@PostMapping(value= "/user/save")
//    public String saveUser(@RequestBody MsUserDto map){
//		try {
//			
//			System.out.println("++++++++++++");
//			System.out.println(map.getUsername());
//			System.out.println(map.getPassword());
//			System.out.println(map.getEmail());
//			System.out.println("++++++++++++");
//			msUserSvc.save(map);
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//        return "penjualan";
//    }
//	
//	@PostMapping(value= "/user/delete")
//    public String deleteUser(@RequestBody MsUserDto map){
//		try {
//			
//			System.out.println("++++++++++++");
//			System.out.println(map.getUsername());
//			System.out.println(map.getPassword());
//			System.out.println(map.getEmail());
//			System.out.println("++++++++++++");
//			msUserSvc.delete(map);
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//        return "penjualan";
//    }
//
//
//
//}
