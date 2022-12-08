package controller.admin.khachhang;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BusinessLogics.KhachHangBL;

@WebServlet("/xoa-khach-hang")
public class DeleteKhachHangServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteKhachHangServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String maKhachHang = request.getParameter("makh");
		boolean delete = KhachHangBL.xoaKhachHangID(maKhachHang);
		String message;
		if (delete) {
			message = "Xóa thành công khách hàng có mã KH: " + maKhachHang;
		} else {
			message = "Xóa không thành công vì khách hàng đã mua hàng";
		}
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(message);
	}

}
