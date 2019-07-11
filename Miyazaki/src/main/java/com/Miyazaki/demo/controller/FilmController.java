package com.Miyazaki.demo.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Miyazaki.demo.DAO.FilmDAO;
import com.Miyazaki.demo.model.Film;


@Transactional
@RestController
public class FilmController {

	@Autowired
	FilmDAO filmDAO;
	
	@GetMapping(value = "/getFilmId/{filmId}")
	public Film getStudentId(@PathVariable int filmId) {
		
		Film filmFound= filmDAO.findOne(filmId);
		return filmFound;
	}
	
	@GetMapping(value = "/getAllFilm")
	public List<Film> getAllFilm() {
		
		List<Film> filmFounds= filmDAO.findAll();
		return filmFounds;
	}
	
	@PostMapping(value = "/createFilm")
	public Film addFilm(@RequestBody Film film) {
		
		Film createdFilm= filmDAO.save(film);
		return createdFilm;
		
	}
	
	@PutMapping(value = "/updateFilm")
	public Film updateFilm(@RequestBody Film film) {
		
		Film updateFilm = filmDAO.save(film);
		return updateFilm;
	}
	
	@DeleteMapping(value = "/deleteByFilmId/{Id}")
	public void deleteFilmById (@PathVariable int Id) {
		
		filmDAO.deleteByFilmId(Id);
	}
	
	/*
	@GetMapping(value = "/getStudentId/{studentId}")
	public Student getStudentId(@PathVariable int studentId) {
		
		Student studentFound= studentDAO.findOne(studentId);
		return studentFound;
	}
	
	@GetMapping(value = "/getAllStudent")
	public List<Student> getAllStudent() {
		
		List<Student> studentFounds= studentDAO.findAll();
		return studentFounds;
	}
	
	@PostMapping(value = "/createStudent")
	public Student addStudent(@RequestBody Student student) {
		
		Student createdStudent= studentDAO.save(student);
		return createdStudent;
		
	}
	@PutMapping(value = "/updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		
		Student updateStudent = studentDAO.save(student);
		return updateStudent;
	}
	@DeleteMapping(value = "/deleteByStudentId/{studentId}")
	public void deleteStudentById (@PathVariable int studentId) {
		
		studentDAO.deleteByStudentId(studentId);
	}*/
	
}
	