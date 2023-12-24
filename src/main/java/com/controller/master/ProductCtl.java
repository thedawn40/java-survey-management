package com.controller.master;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProductCtl {

	@GetMapping("/view")
	public String getData(Model model) {
		try {


		} catch (Exception e) {
			e.printStackTrace();
		}
		return "penjualan";
	}
}
