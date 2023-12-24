package com.dto;

import com.model.BaseEntity;

public class TxSellDtlDto extends BaseEntity{
	
	private String sellNo;

	private String sellNoDtl;
	private String brand;
	private String qty;
	private String price;
	private String weight;
	
	public String getSellNo() {
		return sellNo;
	}
	public void setSellNo(String sellNo) {
		this.sellNo = sellNo;
	}
	public String getSellNoDtl() {
		return sellNoDtl;
	}
	public void setSellNoDtl(String sellNoDtl) {
		this.sellNoDtl = sellNoDtl;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
}
