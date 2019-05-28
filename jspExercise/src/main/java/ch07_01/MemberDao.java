package ch07_01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MemberDao {

	DataSource ds = null;

	public MemberDao() {
		try {
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/MemberDB");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	private static final String SELECT_BY_ID = "SELECT id, fullname, shortname, industry, adress, chairman, manager, spokersman, telephone FROM list WHERE id=?";

	public MemberBean select(int i) {
		MemberBean result = null;
		try (Connection conn = ds.getConnection(); PreparedStatement stmt = conn.prepareStatement(SELECT_BY_ID);) {
			stmt.setInt(1, i);
			try (ResultSet rset = stmt.executeQuery();) {
				if (rset.next()) {
					result = new MemberBean();
					result.setId(rset.getInt("id"));
					result.setFullname(rset.getString("fullname"));
					result.setShortname(rset.getString("shortname"));
					result.setIndustry(rset.getString("industry"));
					result.setAdress(rset.getString("adress"));
					result.setChairman(rset.getString("chairman"));
					result.setManager(rset.getString("manager"));
					result.setSpokersman(rset.getString("spokersman"));
					result.setTelephone(rset.getString("telephone"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	private static final String SELECT_ALL = "Select id, fullname, shortname, industry, adress, chairman, manager, spokersman, telephone from list";

	public List<MemberBean> select() {
		List<MemberBean> result = null;
		try (Connection conn = ds.getConnection();
				PreparedStatement stmt = conn.prepareStatement(SELECT_ALL);
				ResultSet rset = stmt.executeQuery();) {
			result = new Vector<>();
			while (rset.next()) {
				MemberBean temp = new MemberBean();
				temp.setId(rset.getInt("id"));
				temp.setFullname(rset.getString("fullname"));
				temp.setShortname(rset.getString("shortname"));
				temp.setIndustry(rset.getString("industry"));
				temp.setAdress(rset.getString("adress"));
				temp.setChairman(rset.getString("chairman"));
				temp.setManager(rset.getString("manager"));
				temp.setSpokersman(rset.getString("spokersman"));
				temp.setTelephone(rset.getString("telephone"));
				result.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	private static final String UPDATE = "update product set fullname=?, shortname=?, industry=?, adress=?, chairman=?, manager=?, spokersman=?, telephone=? where id=?";

	public int update(MemberBean data) throws SQLException {
		int updateCount = 0;

		try (Connection conn = ds.getConnection(); PreparedStatement stmt = conn.prepareStatement(UPDATE);) {

			stmt.setString(1, data.getFullname());
			stmt.setString(2, data.getShortname());
			stmt.setString(3, data.getIndustry());
			stmt.setString(4, data.getAdress());
			stmt.setString(5, data.getChairman());
			stmt.setString(6, data.getManager());
			stmt.setString(7, data.getSpokersman());
			stmt.setString(8, data.getTelephone());
			stmt.setInt(9, data.getId());

		}

		return updateCount;
	}

	private static final String INSERT = "Insert into list (id, fullname, shortname, industry, adress, chairman, manager, spokersman, telephone) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

	public MemberBean insertMember(MemberBean bean) throws SQLException {
		MemberBean result = null;
		try (Connection conn = ds.getConnection(); PreparedStatement stmt = conn.prepareStatement(INSERT);) {
			stmt.setInt(1, bean.getId());
			stmt.setString(2, bean.getFullname());
			stmt.setString(3, bean.getShortname());
			stmt.setString(4, bean.getIndustry());
			stmt.setString(5, bean.getAdress());
			stmt.setString(6, bean.getChairman());
			stmt.setString(7, bean.getManager());
			stmt.setString(8, bean.getSpokersman());
			stmt.setString(9, bean.getTelephone());

			int i = stmt.executeUpdate();
			if (i == 1) {
				result = this.select(bean.getId());
			}

		}
		return result;
	}

	private static final String DELETE = "Delete from list where id=?";

	public int delete(int id) {
		int result = 0;
		try (Connection conn = ds.getConnection(); PreparedStatement stmt = conn.prepareStatement(DELETE);) {
			stmt.setInt(1, id);
			result = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<MemberBean> findByHighwayName(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}