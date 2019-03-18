package com.web.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ZipServlet
 */
@WebServlet({"/ZipServlet", "/zip"})
public class ZipServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ZipServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");


		String param1 = request.getParameter("input_txt").toString();
		String param2 = request.getParameter("disp_type").toString();

		if ("0".equals(param2)) {
			request.setAttribute("org_length",  param1.getBytes().length);
			request.setAttribute("data",  param1);

			request.getRequestDispatcher("/jsp/zip.jsp").forward(request, response);
		} else {
			System.out.println("原始数据长度:" + param1.getBytes().length);

			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			GZIPOutputStream gout = new GZIPOutputStream(bout);
			gout.write(param1.getBytes());
			gout.close();

			byte gdata[] = bout.toByteArray();
			response.setHeader("Content-Encoding", "gzip");
			response.setHeader("Content-Length", gdata.length + "");
			response.getOutputStream().write(gdata);

//			response.getWriter().append("ZIP:" + param1 + " --------------------------------Served at: ").append(request.getContextPath());
		}




	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
