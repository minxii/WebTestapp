package com.web.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

        //1.浏览器每隔2秒定时刷新页面
//      resp.setHeader("refresh", "2");
//      resp.getWriter().write(++second + "");

//		response.setStatus(302);
//		response.setHeader("Location", "https://www.google.co.jp");
		response.setHeader("refresh", "5;url='https://www.google.co.jp'");
		response.getWriter().write("redirect after... 5s");
//		new Thread (() -> {
//			try {
//				Thread.sleep(3000);
//			} catch (Exception e) {
//				// TODO 自動生成された catch ブロック
//				e.printStackTrace();
//			}
//			response.setHeader("Location", "https://www.google.co.jp");
//		}).start();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
