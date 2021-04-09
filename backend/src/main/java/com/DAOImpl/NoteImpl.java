package com.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.DAO.NoteDAO;
import com.models.Note;


@Repository("NoteImpl")
@Transactional
public class NoteImpl implements NoteDAO {

	private SessionFactory sesFact;

	@Override
	public List<Note> getAll() {
		
		return sesFact.getCurrentSession().createQuery("from user_note",Note.class).list();
	}

	@Override
	public Note getFromId(int id) {
		
		return sesFact.getCurrentSession().get(Note.class,id);
	}

	@Override
	public boolean add(Note note) {
		
		sesFact.getCurrentSession().save(note);
		
		return true;
		
	}

	@Override
	public boolean update(Note note) {
		
		sesFact.getCurrentSession().update(note);
		
		return true;
		
	}

	@Override
	public boolean delete(Note note) {
		
		sesFact.getCurrentSession().delete(note);
		
		return true;
		
	}
	
	
	

}
