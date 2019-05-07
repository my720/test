package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;


public class UserCreateCompleteDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private DateUtil dateUtil=new DateUtil();
	private String sql = "insert into login_user_transaction(login_id,login_pass,user_name,insert_date)values(?,?,?,?)";

	public void createUser(String loginUserId,String loginUserPassword,String userName)throws SQLException{
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginUserPassword);
			preparedStatement.setString(3, userName);
			preparedStatement.setString(4, dateUtil.getDate());
			//確認処理
			if(loginUserId == null){
				System.out.println("loginUserIdがnull");
			}else if(loginUserPassword ==null){
				System.out.println("loginUserPasswordがnull");
			}else if(userName ==null){
				System.out.println("userNameがnull");
			}else if(dateUtil.getDate() == null){
				System.out.println("dateUtilがnull");
			}else{
				System.out.println("値セット完了");
				System.out.println(loginUserId);
				System.out.println(loginUserPassword);
				System.out.println(userName);
				System.out.println(dateUtil.getDate());
			}
			//
			preparedStatement.execute();
			//確認処理
			System.out.println("実行完了");
			//
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}
