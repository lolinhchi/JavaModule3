package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TongServlet4
 */
@WebServlet("/TongServlet4")
public class TongServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TongServlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double a = Double.parseDouble(request.getParameter("soA"));
		double b = Double.parseDouble(request.getParameter("soB"));
		double tong = a + b;
		 response.setContentType("text/html;charset=utf-8");
		PrintWriter out =response.getWriter(); 
		 out.println("<!DOCTYPE html>");
		 out.println("<html>");
		 out.println("<head>"); 
		 
		 out.println("<title>Cộng 2 số </title>");
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<h2> Tổng 2 số a và b là: </h2>");
		 out.println(tong);
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
