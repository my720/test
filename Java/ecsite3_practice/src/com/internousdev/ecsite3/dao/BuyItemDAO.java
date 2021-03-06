package com.internousdev.ecsite3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite3.dto.BuyItemDTO;
import com.internousdev.ecsite3.util.DBConnector;

public class BuyItemDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	BuyItemDTO buyItemDTO=new BuyItemDTO();

	public BuyItemDTO getBuyItemInfo(){
		String sql="select id,item_name,item_price from item_info_transaction";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()){
				buyItemDTO.setId(resultSet.getInt("id"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemPrice("item_price");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return buyItemDTO;
	}
}