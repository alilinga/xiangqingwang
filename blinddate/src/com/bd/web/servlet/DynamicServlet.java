package com.bd.web.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;

import com.bd.bean.Choose;
import com.bd.dao.impl.ChooseDaoImpl;
import com.bd.service.impl.ChooseServiceImpl;

/**
 * Servlet implementation class DynamicServlet
 */
public class DynamicServlet extends BaseServlet {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception{
//		String uid = request.getParameter("uid");
		String uid="u0001";
		ChooseServiceImpl cService = new ChooseServiceImpl();
		//在择偶条件表查询登录用户的择偶条件的年龄区间
		Choose chooseAge=cService.findChooseAgeByUid(uid);
		System.out.println(chooseAge);
		ArrayList<User> user=cService.findUserByAge();
		return "1";
	}

}
