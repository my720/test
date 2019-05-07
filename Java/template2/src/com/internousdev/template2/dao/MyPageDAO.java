package com.internousdev.template2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template2.dto.MyPageDTO;
import com.internousdev.template2.util.DBConnector;

public class MyPageDAO {

	public MyPageDTO getMyPageUserInfo(String item_transaction_id,String user_master_id)throws SQLException{
		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();
		MyPageDTO myPageDTO=new MyPageDTO();

		String sql="SELECT iit.item_name,ubit.total_price,ubit.total_count,ubit.pay FROM user_buy_item_transaction ubit LEFT JOIN item_info_transaction iit ON ubit.item_transaction_id=iit.id WHERE ubit.item_transaction_id=? AND ubit.user_master_id=? ORDER BY ubit.insert_date DESC";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, item_transaction_id);
			preparedStatement.setString(2, user_master_id);
			//確認処理
			System.out.println("PreparedStatement完了");
			//
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()){
				myPageDTO.setItemName(resultSet.getString("item_name"));
				myPageDTO.setTotalPrice(resultSet.getString("total_price"));
				myPageDTO.setTotalCount(resultSet.getString("total_count"));
				myPageDTO.setPayment(resultSet.getString("pay"));
				//確認処理
				System.out.println("ResultSet完了");
				//
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		//確認処理
		System.out.println("getMyPageUserInfoメソッド実行完了");
		//
		return myPageDTO;
	}
	public int buyItemHistoryDelete(String item_transaction_id,String user_master_id)throws SQLException{
		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();

		String sql="DELETE FROM user_buy_item_transaction WHERE item_transaction_id=? AND user_master_id=?";
		PreparedStatement preparedStatement;
		int result=0;
		try{
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, item_transaction_id);
			preparedStatement.setString(2, user_master_id);

			result=preparedStatement.executeUpdate();
			//確認処理
			System.out.println("PreparedStatement完了");
			//
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		//確認処理
		System.out.println("buyItemHistoryDeletemメソッド実行完了");
		//
		return result;
	}
}