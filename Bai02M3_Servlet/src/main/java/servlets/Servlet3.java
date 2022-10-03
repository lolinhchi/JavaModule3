package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

/**
 * Servlet implementation class Servlet3
 */
@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 response.setContentType("text/html;charset=utf-8");
		 PrintWriter out =response.getWriter(); 
		 out.println("<!DOCTYPE html>");
		 out.println("<html>");
		 out.println("<head>"); 
		 out.println("<title>Loại sữa </title>");
		 out.println("</head>");
		 out.println("<body>");
		 out.println("DANH SÁCH LOẠI SỮA");
		 out.println("<table>");
		 out.println("<tr>");
		 out.println("<th> Mã loại </th> ");
		 out.println("<th> Tên loại </th> ");		 
		 out.println("</tr>");
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/qlbansua";
			String query = "Select * from loai_sua ";
			Connection conn = DriverManager.getConnection(url, "root", "");
			Statement state = conn.createStatement();
			ResultSet rs = state.executeQuery(query);
			while(rs.next()) {
				out.println("<tr>");
				out.println("<th>"+ rs.getString("ma_loai_sua") + "</th>");
				out.println("<th>"+ rs.getString("ten_loai") + "</th>");
				out.println("</tr>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		 out.println("</table>");
		 out.println("</body>");
		 out.println("</html>");
		 
		 
		 
		 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
