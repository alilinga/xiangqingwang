package com.bd.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//这是一个例子


public class ServletDemo03 extends BaseServlet {
	public ServletDemo03() {
		System.out.println("么有参数构造函数");
	}
	
	public String addStu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("添加学生");
		return "/例子test.html";
	}
	public String delStu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("删除学生");
		return "/例子test.html";
		
	}
	public String checkStu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("检查学生");
		response.getWriter().println("DDDDDD");
		return null;
	}
}
