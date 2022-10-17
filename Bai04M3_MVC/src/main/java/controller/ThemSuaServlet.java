package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businessLogics.HangSuaBL;
import businessLogics.LoaiSuaBL;
import javaBeans.HangSua;
import javaBeans.LoaiSua;

/**
 * Servlet implementation class ThemSuaServlet
 */
@WebServlet({"/ThemSuaServlet", "/them-sua.html"})
public class ThemSuaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThemSuaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		request.getRequestDispatcher("views/them-sua.jsp").forward(request, response);
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String maSua = request.getParameter("maSua");
		String tenSua = request.getParameter("tenSua");
		String loaiSua = request.getParameter("cboLoai");
		
		List<LoaiSua> dsls = LoaiSuaBL.docTatCa();
		List<HangSua> dshs = HangSuaBL.docTatCa();
		
		request.setAttribute("dsls", dsls);
		request.setAttribute("dshs", dshs);
		request.getRequestDispatcher("views/them-sua.jsp").forward(request, response);
	}

}
