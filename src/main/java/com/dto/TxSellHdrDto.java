package com.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class TxSellHdrDto {
	
	private String sellNo;

	private String sellDate;
	private String customerId;
	private String customerName;
	private String pic;
	private String invoiceNo;
	private String totalPrice;
	private String sellNote;
	private String createdDate;
	private String createdBy;
	private String updatedDate;
	private String updatedBy;
	
	private List<TxSellDtlDto> listDetail;
	
	public String getSellNo() {
		return sellNo;
	}
	public void setSellNo(String sellNo) {
		this.sellNo = sellNo;
	}
	public String getSellDate() {
		return sellDate;
	}
	public void setSellDate(String sellDate) {
		this.sellDate = sellDate;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getSellNote() {
		return sellNote;
	}
	public void setSellNote(String sellNote) {
		this.sellNote = sellNote;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public List<TxSellDtlDto> getListDetail() {
		return listDetail;
	}
	public void setListDetail(List<TxSellDtlDto> listDetail) {
		this.listDetail = listDetail;
	}
}
