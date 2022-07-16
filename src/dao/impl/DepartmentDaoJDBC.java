package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dao.DepartmentDao;
import db.DB;
import db.DbException;
import db.DbIntegrityException;
import entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao{
	private Connection conn;
	
	public DepartmentDaoJDBC(Connection conn) {
		this.conn=conn;
	}
	
	@Override
	public void insert(Department dep) {
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			st=conn.prepareStatement("");
			
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
		}
		
	}

	@Override
	public void update(Department dep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		PreparedStatement st=null;
		try {
			st=conn.prepareStatement("DELETE FROM department WHERE Id=?");
			
			st.setInt(1,id);
			st.executeUpdate();
		}catch(SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		}finally {
			DB.closeStatement(st);
		}
		
	}

	@Override
	public Department findById(Integer id) {
		PreparedStatement st=null;
		ResultSet rs=null;
		
		try {
			st=conn.prepareStatement(
					"SELECT * FROM department WHERE Id = ?");
			
			st.setInt(1, id);
			rs=st.executeQuery();
			if(rs.next()) {
				Department obj=new Department();;
				obj.setId(rs.getInt("Id"));
				obj.setName(rs.getString("Name"));
				return obj;
			}
			return null;
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
