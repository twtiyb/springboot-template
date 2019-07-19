package com.example.java.gettingstarted.service;

import com.example.java.gettingstarted.entity.User;
import com.sun.corba.se.spi.servicecontext.UEInfoServiceContext;

import javax.jnlp.UnavailableServiceException;

/**
 * Created by xuchun on 2017/7/1.
 */
public interface TestEntityService {
	User login(User user);

	Task getsMyTask(User user);

}
