package myweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import related.TestClass;

public class MtServlet extends HttpServlet {

	private static final long serialVersionUID = -4180666866461087624L;
	static {
		System.out.println("");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TestClass tc = new TestClass();
		String name = req.getParameter("name");
		tc.print(name);
		resp.setContentType("text/html; charset=UTF-8");
		resp.getWriter().write("<b>see result on hard disk</b> <a href='"+req.getContextPath()+"'>return</a>");
		resp.flushBuffer();
	}

	public MtServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

}
