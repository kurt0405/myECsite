package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;


public class ItemListAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private ItemListDAO itemListDAO=new ItemListDAO();
	private ArrayList<ItemInfoDTO>itemList=new ArrayList<ItemInfoDTO>();

	public String execute() throws SQLException {

			itemList=itemListDAO.getItemInfo();
		return SUCCESS;
	}

	public void setSession(Map<String, Object> Session) {
		this.session = Session;
	}

	public ArrayList<ItemInfoDTO> getItemList() {
		return this. itemList;
	}

}
