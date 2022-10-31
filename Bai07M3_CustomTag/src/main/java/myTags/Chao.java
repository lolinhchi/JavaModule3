package myTags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Chao extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		//<mt:chao> Chill </mt:chao> --> Chào mừng Chill đến với custom tag
		JspWriter out = getJspContext().getOut();
		JspFragment f = getJspBody();
		out.print("Chào mừng ");
		if(f!=null) {
			f.invoke(out);
		}
		out.print(" đến với custom tag");
	}
}
