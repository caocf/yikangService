package com.yikang.seniroAccount;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.yikang.base.SendRequest;


/**
 * @author liushuaic
 * @date 2015/08/26 10:59
 * @desc 用户测试
 * 
 * **/
public class UserTest {

	
	/**
	 * @author liushuaic
	 * @date 2015/07/28 12:15
	 * @desc 测试00-17-01 登陆用户
	 * */
	@Test
	public void TestRegisterUser(){
		try {
			Map<String,Object> paramData=new HashMap<String, Object>();
			paramData.put("loginName","liushuai");
			paramData.put("passWord","liushuai");
			
			SendRequest.sendPost("regist",paramData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}