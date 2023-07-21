package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
	- 정수 합을 구하는 서비스 제공
	
	1. 서블릿 생성
	2. 주소 매핑 : /sum
	3. post 방식의 요청만을 처리. 나머지 방식의 요청에는 405 응답
	4. query param의 이름: num1, num2
	5. 합 연산 view 페이지 응답 전송
	6. postman 사용해서 요청 테스트
	7. form 양식 작성 후 action 속성 설정
	
	- 차
	1. /minus
	2. POST: query param의 이름: num1, num2
	- 곱
	1. /multi
	2. query param의 이름: num1, num2
	- 세션동안 서비스 이용 기록
	1. /status
	2. 몇 번의 계산을 요청했는지
	3. 잘 처리된 요청 수
	4. X 요청 수
 */

@WebServlet("/number/sum")
public class SumServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("message", "더하기 연산 숫자값 두 개 입력");
		req.getRequestDispatcher("/WEB-INF/numberform.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");

		System.out.println("입력값1: " + num1);
		System.out.println("입력값2: " + num2);

		Integer i1 = Integer.valueOf(num1);
		Integer i2 = Integer.valueOf(num2);

		Integer sum = i1 + i2;

		req.setAttribute("result", sum);
		req.setAttribute("oper", "합");
		req.getRequestDispatcher("/WEB-INF/result.jsp").forward(req, resp);
	}

}
