package com.internousdev.ecsite.action;

import java.sql.SQLException;

import com.internousdev.ecsite.dao.ItemListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteCompleteAction extends ActionSupport{
	private ItemListDeleteCompleteDAO dao=new ItemListDeleteCompleteDAO();

	public String execute()throws SQLException{
		dao.ItemListHistoryDelete();
		return SUCCESS;
	}
}
