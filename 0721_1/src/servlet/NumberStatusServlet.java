package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/number/status")
public class NumberStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		Integer cnt = (Integer) session.getAttribute("cnt");
		Integer successCnt = (Integer) session.getAttribute("successCnt");

		if (session != null && cnt != null) {
			response.getWriter().println("total operation count : " + cnt);
			response.getWriter().println("success operation count : " + successCnt);
		} else {
			response.getWriter().println("No History");
		}

	}

}
