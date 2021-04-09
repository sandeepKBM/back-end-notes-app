package com.DAO;

import java.util.List;

import com.models.Note;

public interface NoteDAO {
	
	public List<Note> getAll();
	
	public Note getFromId(int id);
	
	public boolean add(Note note);
	
	public boolean update(Note note);
	
	public boolean delete(Note note);
	
}
