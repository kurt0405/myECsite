package com.internousdev.ecsite.dto;

public class BuyItemDTO {
	private int id;
	private String itemName;
	private String itemprice;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName=itemName;
	}

	public String getItemprice() {
		return itemprice;
	}

	public void setItemprice(String itemprice) {
		this.itemprice = itemprice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id=id;
	}


}
