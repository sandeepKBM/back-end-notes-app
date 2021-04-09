package com.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.DAO.userDAO;
import com.models.user;


@Repository("userImpl")
@Transactional
public class userImpl implements userDAO{
	
	private SessionFactory sesFact;

	@Override
	public user getByID(int Id) {
		return sesFact.getCurrentSession().get(user.class,Id);
	}

	@Override
	public List<user> getAll() {
		return sesFact.getCurrentSession().createQuery("from user_table",user.class).list();
	}

	@Override
	public boolean getUserByEmailAndPassword(String email, String password) {
		
		sesFact.getCurrentSession().createQuery("from user_table where user_email = '"+email+"' and user_password = '"+password+"'",user.class);
		
		return true;
		
	}

	@Override
	public boolean getUserbyUserNameAndPassword(String userName, String email, String password) {
		
		sesFact.getCurrentSession().createQuery("from user_table where user_email = '"+email+"' and user_password = '"+password+"' and user_name = '"+userName+"'",user.class);
		
		return true;
		
	}

}
