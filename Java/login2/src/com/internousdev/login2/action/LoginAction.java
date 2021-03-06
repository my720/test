package com.internousdev.login2.action;

import java.sql.SQLException;

import com.internousdev.login2.dao.LoginDAO;
import com.internousdev.login2.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String name;
	private String password;
	public String execute()throws SQLException{
		String ret=ERROR;
		LoginDAO dao=new LoginDAO();
		LoginDTO dto=new LoginDTO();
		dto=dao.select(name, password);

		if(name.equals(dto.getName())){
			if(password.equals(dto.getPassword())){
				ret=SUCCESS;
			}else{
				System.out.println("変数の値がnull、または違います。");//失敗処理
				System.out.println(dto.getName());//値チェック
				System.out.println(dto.getPassword());//値チェック
				ret=ERROR;
			}
		}
		System.out.println("executeメソッド実行完了");//確認処理
		return ret;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getPasswor(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
}