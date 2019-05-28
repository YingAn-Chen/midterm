package ch07_01;

import java.sql.SQLException;
import java.util.List;

import ch07_01.MemberBean;

public class MemberService {

	MemberDao dao = null;

	public MemberService() {
		dao = new MemberDao();
	}

	public ch07_01.MemberBean select(int id) {
		return dao.select(id);
	}

	public List<ch07_01.MemberBean> select() {
		return dao.select();
	}

	public ch07_01.MemberBean insertMember(ch07_01.MemberBean bean) throws SQLException {
		return dao.insertMember(bean);
	}

	public int delete(int id) {
		return dao.delete(id);
	}
}