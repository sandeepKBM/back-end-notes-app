package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class start {
	
	
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
	}
}
