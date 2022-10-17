package servlets;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class MultiUploadFile
 */
@WebServlet({"/MultiUploadFile", "/multi.html"})
@MultipartConfig
public class MultiUploadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MultiUploadFile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		request.getRequestDispatcher("multi.jsp").forward(request, response);
		response.sendRedirect("multi.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	private static String upload(Part part, String thuMucTaiLen) {
		String tenTapTin = part.getSubmittedFileName();
		
		try {
			InputStream is = part.getInputStream();
			OutputStream os = new FileOutputStream(thuMucTaiLen + tenTapTin);
			int b ;
			while((b = is.read()) != -1) {
				os.write(b);
			}
			is.close();
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tenTapTin;
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String thuMuc = getServletContext().getRealPath("/uploads/");
		
		List<String> list = new ArrayList<String>();
		for(Part part : request.getParts()) {
			String tenTapTin = upload(part, thuMuc);
			list.add(tenTapTin);
		}
		request.setAttribute("list", list);
		request.getRequestDispatcher("multi.jsp").forward(request, response);
	}

}
