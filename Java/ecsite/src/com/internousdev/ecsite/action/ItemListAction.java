package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport{
	private String itemName;
	private String itemPrice;
	private String itemStock;
	private ItemListDAO dao=new ItemListDAO();
	private ArrayList<ItemListDTO> itemList=new ArrayList<ItemListDTO>();
	private String deleteFlg;
	/*private String errorMessage;*/

	public String execute()throws SQLException{
		if(deleteFlg ==null){
			itemList=dao.itemListInfo();
			itemName=itemList.get(0).getItemName();
			itemPrice=itemList.get(0).getItemPrice();
			itemStock=itemList.get(0).getItemStock();
		}
		return SUCCESS;
	}
	/*public void delete()throws SQLException{
		int res=dao.ItemListHistoryDelete();
		if(res>0){
			itemList=null;
			setErrorMessage("商品情報を正しく削除しました。");
		}else if(res==0){
			setErrorMessage("商品情報の削除に失敗しました。");
		}
	}*/

	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName=itemName;
	}
	public String getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(String itemPrice){
		this.itemPrice=itemPrice;
	}
	public String getItemStock(){
		return itemStock;
	}
	public void setItemStock(String itemStock){
		this.itemStock=itemStock;
	}
	public ArrayList<ItemListDTO> getItemList(){
		return this.itemList;
	}
	/*public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage=errorMessage;
	}*/
}