package application.form;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model2.mvcboard.MVCBoardDAO;

@WebServlet("/form/bc.do")
public class BCController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 폼값 저장
		String name = req.getParameter("name");
		String phone_num = req.getParameter("phone_num");
		String email = req.getParameter("email");
		// int regi_type : 접수종류 구분
		String note = req.getParameter("note");
		// int bt_postcode;				// 우편번호
		String bt_basicadd = req.getParameter("bt_basicadd");
		String bt_detailadd = req.getParameter("bt_detailadd");
		String bc_type = req.getParameter("bc_type");
		// private int bc_space;		// 평수
		String bc_date = req.getParameter("bc_date");
		
		// DB연결 후 로그인여부 검증
		appFormDAO dao = new appFormDAO();
		
		
		
		
	}
}
