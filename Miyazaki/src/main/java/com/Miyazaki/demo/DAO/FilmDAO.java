package com.Miyazaki.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Miyazaki.demo.model.Film;

@Repository
public interface FilmDAO extends JpaRepository<Film, Integer> {

	void deleteByFilmId(int id);
	
	
}
