package ch07_01;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ch07_01/delete.do")
public class DeleteCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Map<String, String> errorMessage = new HashMap<>();
		request.setAttribute("ErrorMsg", errorMessage);
		request.setCharacterEncoding("UTF-8");
		String id2 = request.getParameter("mId");

		int id = -1;

		if (id2 == null || id2.trim().length() > 0) {
			try {
				id = Integer.valueOf(id2);
			} catch (NumberFormatException e) {
				errorMessage.put("id2", "帳號此欄必須輸入");
			}
		}
		
		if (!errorMessage.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("/deleteForm.jsp");
			rd.forward(request, response);
			return;
		}
		

		MemberDao dao = new MemberDao();
		try {
			 dao.delete(id);
			System.out.println("delete id=" + id);
			String str = null;
			
			str = "第"+id+"筆資料已刪除成功";
			
			session.setAttribute("DeleteCmopanyInfo", str);
			response.sendRedirect("deleteSuccess.jsp");
			return;

		} catch (Exception e) {
			errorMessage.put("exception", "資料庫存取錯誤:" + e.getMessage());
		}
		RequestDispatcher rd = request.getRequestDispatcher("deleteForm.jsp");
		rd.forward(request, response);
		return;

	}

}