package com.bd.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bd.bean.Choose;
import com.bd.dao.ChooseDao;
import com.bd.util.JDBCOracleUtil;

public class ChooseDaoImpl implements ChooseDao {

	public Choose findChooseAgeByUid(String uid) {
		System.out.println("uid"+uid);
		Choose choose = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql="select * from choose1 where u_id=?";
			conn = JDBCOracleUtil.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, uid);
			rs = ps.executeQuery();
			while (rs.next()) {
				choose=new Choose();
				choose.setU_id(rs.getString("u_id"));
				choose.setC_age(rs.getString("c_age"));
				choose.setC_bodytype(rs.getString("c_bodytype"));
				choose.setC_drink(rs.getString("c_drink"));
				choose.setC_education(rs.getString("c_education"));
				choose.setC_havechild(rs.getString("c_havechild"));
				choose.setC_havephoto(rs.getString("c_havephoto"));
				choose.setC_height(rs.getString("c_height"));
				choose.setC_income(rs.getString("c_income"));
				choose.setC_jobcity(rs.getString("c_jobcity"));
				choose.setC_marrystatus(rs.getString("c_marrystatus"));
				choose.setC_smoke(rs.getString("c_smoke"));
				choose.setC_wantchild(rs.getString("c_wantchild"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCOracleUtil.close(conn, ps, rs);
		}
		return choose;
	}

}
