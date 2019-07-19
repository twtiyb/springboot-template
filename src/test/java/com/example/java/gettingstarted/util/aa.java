package com.example.java.gettingstarted.util;

import okhttp3.Request;
import okhttp3.Response;

public class aa {

	public static void main(String[] args) throws Exception {
		System.out.println(System.getProperty("java.library.path"));
		Response checkCodeRes = HttpUtils.execute(new Request.Builder().url("http://hnzj.user.ghlearning.com/train/login/get-login-vcode.gson").build());
		Request loginReq = checkCodeRes.request();
		String code = CheckCodeUtil.getCode(checkCodeRes.body().bytes());
//		log.error("Calling the 'CounterLog' with a message");
	}
}
