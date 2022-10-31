package myTags;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import businessLogic.HangSuaBL;
import javaBeans.HangSua;

public class CboHangSua extends SimpleTagSupport {
	private String maHang;
	
	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}

	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		JspFragment f = getJspBody();
		List<HangSua> dshs = HangSuaBL.docTatCa();
		
		if(f!= null) {
			f.invoke(out);
		}
		out.print("<select name='cboLoaiSua' >");
		for(HangSua hs : dshs) {
			if(hs.getMaHang().equals(maHang)) {
				out.print("<option value='" + hs.getMaHang() + "' selected>" + hs.getTenHang() + "</option>" );
			}else {
				out.print("<option value='" + hs.getMaHang() + "'>" + hs.getTenHang() + "</option>" );
			}
			
		}
		out.print("</select>");
	}
}
