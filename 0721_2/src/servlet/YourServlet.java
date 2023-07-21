package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/your")
public class YourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = LoggerFactory.getLogger(YourServlet.class);

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 중요도에 따라서 로그 기록을 남길 수 있다.
		// debug, info, warn, error ...
		logger.info("인포 레벨 : 로거를 통한 콘솔 기록 남겨보기");
		logger.debug("디버그 레벨 : 로거를 통한 콘솔 기록 남겨보기");

		request.setAttribute("your", "yourValue");
	}
}