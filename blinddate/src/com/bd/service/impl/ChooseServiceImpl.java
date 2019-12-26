package com.bd.service.impl;

import java.util.ArrayList;

import org.apache.catalina.User;

import com.bd.bean.Choose;
import com.bd.dao.impl.ChooseDaoImpl;
import com.bd.service.ChooseService;

public class ChooseServiceImpl implements ChooseService {

	public ArrayList<User> findUserByAge() {
		// TODO Auto-generated method stub
		return null;
	}

	public Choose findChooseAgeByUid(String uid) {
		ChooseDaoImpl cDao = new ChooseDaoImpl();
		return cDao.findChooseAgeByUid(uid);
	}

}
