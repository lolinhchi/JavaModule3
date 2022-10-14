package servlets;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class UploadServlet
 */
@MultipartConfig
@WebServlet({"/UploadServlet", "/upload-files.html"})
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("upload-files.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Part part = request.getPart("tapTin");
		String tenTapTin = part.getSubmittedFileName();
		String thuMucTaiLen = getServletContext().getRealPath("/uploads/");//thu muc tai len tren server
		
		InputStream is = part.getInputStream();
		OutputStream os = new FileOutputStream(thuMucTaiLen + tenTapTin);
		
		int b;
		while((b=is.read()) !=-1) {
			os.write(b);
		}
		is.close();
		os.close();
		
//		response.sendRedirect("upload-files.jsp");
		request.setAttribute("tenTapTin", tenTapTin);
		request.getRequestDispatcher("upload-files.jsp").forward(request, response);
	}

}
