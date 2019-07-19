package com.example.java.gettingstarted.util;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;

@Slf4j
public class HttpUtilsTest {

	@Test
	public void login() throws Exception {
		Response checkCodeRes = HttpUtils.execute(new Request.Builder().url("http://hnzj.user.ghlearning.com/train/login/get-login-vcode.gson").build());
		Request loginReq = checkCodeRes.request();
		String code = CheckCodeUtil.getCode(checkCodeRes.body().bytes());
		log.error("Calling the 'CounterLog' with a message");
	}


	@Test
	public void checkCode() throws Exception {
		Response checkCodeRes = HttpUtils.execute(new Request.Builder().url("http://hnzj.user.ghlearning.com/train/login/get-login-vcode.gson").build());
		Request loginReq = checkCodeRes.request();
		String code = CheckCodeUtil.getCode(checkCodeRes.body().bytes());
		log.error("Calling the 'CounterLog' with a message");
	}


}