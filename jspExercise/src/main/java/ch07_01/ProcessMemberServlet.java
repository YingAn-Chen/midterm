package ch07_01;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ch07_01/member.do")

public class ProcessMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		Map<String, String> errorMessage = new HashMap<>();
		request.setAttribute("ErrorMsg", errorMessage);

		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("cId");

		Integer id2 = -1;

		if (id != null && id.length() > 0) {
			try {
				id2 = Integer.valueOf(id);
			} catch (NumberFormatException e) {
				errorMessage.put("id", "此欄必須為數值");
				e.printStackTrace();
			}
		} else {
			errorMessage.put("id", "此欄必須為數值");
		}

		String fullname = request.getParameter("cfName");

		if (fullname == null || fullname.trim().length() == 0) {
			errorMessage.put("fullname", "此欄必須輸入");
		}

		String shortname = request.getParameter("scName");

		if (shortname == null || shortname.trim().length() == 0) {
			errorMessage.put("shortname", "此欄必須輸入");
		}

		String industry = request.getParameter("cinName");

		if (industry == null || industry.trim().length() == 0) {
			errorMessage.put("industry", "此欄必須輸入");
		}
		String adress = request.getParameter("cAddress");

		if (adress == null || adress.trim().length() == 0) {
			errorMessage.put("address", "此欄必須輸入");
		}

		String chairman = request.getParameter("cchName");
		if (chairman == null || chairman.trim().length() == 0) {
			errorMessage.put("chairman", "此欄必須輸入");
		}

		String manager = request.getParameter("cmaName");
		if (manager == null || manager.trim().length() == 0) {
			errorMessage.put("manager", "此欄必須輸入");
		}

		String spokersman = request.getParameter("cspoName");
		if (spokersman == null || spokersman.trim().length() == 0) {
			errorMessage.put("spokersman", "此欄必須輸入");
		}
		String telephone = request.getParameter("cTelephone");
		if (telephone == null || telephone.trim().length() == 0) {
			errorMessage.put("telephone", "此欄必須輸入");
		}

		if (!errorMessage.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("/ch07_01/InsertMemberForm.jsp");
			rd.forward(request, response);
			return;
		}

		MemberBean mb = new MemberBean(id2, fullname, shortname, industry, adress, chairman, manager, spokersman,
				telephone);
		try {
			MemberService service = new MemberService();
			service.insertMember(mb);

			session.setAttribute("memberBean", mb);

			response.sendRedirect(response.encodeRedirectURL("InsertMemberSuccess.jsp"));
			return;
		} catch (SQLException e) {
			if (e.getMessage().indexOf("重複的索引鍵") != -1 || e.getMessage().indexOf("Duplicate entry") != -1) {
				errorMessage.put("cId", "帳號重複，請重新輸入帳號");
			} else {
				errorMessage.put("exception", "資料庫存取錯誤:" + e.getMessage());
			}
			RequestDispatcher rd = request.getRequestDispatcher("/ch07_01/InsertMemberForm.jsp");
			rd.forward(request, response);
			return;
		}
	}
}
