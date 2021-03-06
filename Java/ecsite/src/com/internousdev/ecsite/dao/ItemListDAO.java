package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();

	public ArrayList<ItemListDTO> itemListInfo()throws SQLException{
		ArrayList<ItemListDTO> itemListDTO=new ArrayList<ItemListDTO>();
		String sql="SELECT item_name,item_price,item_stock FROM item_info_transaction";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				ItemListDTO dto=new ItemListDTO();
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getString("item_price"));
				dto.setItemStock(resultSet.getString("item_stock"));
				itemListDTO.add(dto);
				//テスト
				for(ItemListDTO i:itemListDTO){
					System.out.println("itemName:"+i.getItemName());
					System.out.println("itemPrice:"+i.getItemPrice());
					System.out.println("itemStock:"+i.getItemStock());
					//
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return itemListDTO;
	}
	public int ItemListHistoryDelete()throws SQLException{
		String sql="DELETE FROM item_info_transaction_id";
		PreparedStatement preparedStatement;
		int result=0;
		try{
			preparedStatement=connection.prepareStatement(sql);
			result=preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return result;

	}
}