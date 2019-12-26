package com.bd.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCOracleUtil {
	//定义jdbc相关接口和类对象
	static Connection conn=null;
	//将驱动加载至JVM
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConn() {
		String url="jdbc:oracle:thin:@127.0.1:1521:orcl";
		String user="user1";
		String password="123";
		//定义数据库的连接
		try {
			conn=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return conn;
	}
	//定义连接对象的关闭方法
	
	private static void CloseObject(Connection conn) throws SQLException {
		if (conn!=null)
		conn.close();
	}
	private static void CloseObject(ResultSet rs) throws SQLException {
		if (rs!=null)
		rs.close();
	}
	private static void CloseObject(PreparedStatement ps) throws SQLException {
		if (ps!=null)
		ps.close();
	}
	public static void close(Connection conn,PreparedStatement ps) {
		try {
			CloseObject(ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				CloseObject(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
	public static void close(Connection conn,PreparedStatement ps,ResultSet rs) {
		try {
			CloseObject(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				CloseObject(ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					CloseObject(conn);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
