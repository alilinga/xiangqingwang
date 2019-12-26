package com.bd.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 	标准的编码过滤方案
 */
public class EncodeFilter implements Filter {
	String encode=null;
	String type=null;
	
	public void init(FilterConfig filterConfig) throws ServletException {
		encode=filterConfig.getInitParameter("encodeing");
		type=filterConfig.getInitParameter("type");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest requests=(HttpServletRequest)request;
		HttpServletResponse responses=(HttpServletResponse)response;
		//编码过滤
		requests.setCharacterEncoding(encode);
		responses.setCharacterEncoding(encode);
		responses.setContentType(type);
		
		chain.doFilter(request, responses);
	}
}
