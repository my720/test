package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware{
	public Map<String,Object>session;

	public String execute(){
		session.clear();
		//確認処理
		if(session.isEmpty()){
			System.out.println("セッションクリア完了");
		}else{
			System.out.println("セッションがクリアに異常あり");
		}
		//
		return SUCCESS;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
