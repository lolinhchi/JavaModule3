package bussinessLogic;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CSDL {

	private static SessionFactory FACTORY;
	static {
		FACTORY =new Configuration().configure().buildSessionFactory();
	}
	public static SessionFactory getFACTORY() {
		return FACTORY;
	}

	
}
