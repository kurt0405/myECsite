package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDeleteCompleteDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;


public class ItemListDeleteCompleteAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private ItemListDeleteCompleteDAO itemListDeleteCompleteDAO=new ItemListDeleteCompleteDAO();
	private ArrayList<ItemInfoDTO>itemList=new ArrayList<ItemInfoDTO>();
	private String message;

//	ArrayList<ItemInfoDTO> itemInfoDTO = new ArrayList<ItemInfoDTO>();
//	itemList=itemListDAO.getItemInfo();

	public String execute() throws SQLException{
		System.out.println("a");

			int res=itemListDeleteCompleteDAO.itemListHistoryDelete();
			if(res>0) {
				setItemList(null);
				setMessage("商品情報を正しく削除しました。");
			}else if(res==0) {
				setMessage("商品情報の削除に失敗しました。");
			}
		return SUCCESS;
	}



	public Map<String, Object> getSession() {
		return session;
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



	public ItemListDeleteCompleteDAO getItemListDeleteCompleteDAO() {
		return itemListDeleteCompleteDAO;
	}



	public void setItemListDeleteCompleteDAO(ItemListDeleteCompleteDAO itemListDeleteCompleteDAO) {
		this.itemListDeleteCompleteDAO = itemListDeleteCompleteDAO;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



	public ArrayList<ItemInfoDTO> getItemList() {
		return itemList;
	}



	public void setItemList(ArrayList<ItemInfoDTO> itemList) {
		this.itemList = itemList;
	}
}
