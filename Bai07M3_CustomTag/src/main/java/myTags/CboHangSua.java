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

	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		JspFragment f = getJspBody();
		List<HangSua> dshs = HangSuaBL.docTatCa();
		
		if(f!= null) {
			f.invoke(out);
		}
		out.print("<select name='cboLoaiSua' >");
		for(HangSua hs : dshs) { 
			out.print("<option value='" + hs.getMaHang() + "'>" + hs.getTenHang() + "</option>" );
		}
		out.print("</select>");
	}
}
