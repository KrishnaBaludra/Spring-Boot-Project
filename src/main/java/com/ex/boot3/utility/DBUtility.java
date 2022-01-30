package com.ex.boot3.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtility {
	private static SessionFactory sf = null;

	public static SessionFactory getSessionFactory() {
		if (sf == null) {
			sf = new Configuration().configure().buildSessionFactory();
		}
		return sf;
	}

}
