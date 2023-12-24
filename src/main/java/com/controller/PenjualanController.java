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
//import com.service.TxSellHdrService;
//
//@Controller
//public class PenjualanController {
//	
//	@Autowired
//	TxSellHdrService txSellHdrSvc;
//	
//	@GetMapping({ "/penjualan"})
//    public String getData(Model model){
//		try {
//			
//			List<TxSellHdr> data = txSellHdrSvc.findAll();
//	        model.addAttribute("dataSell", data);
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//        return "penjualan";
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
