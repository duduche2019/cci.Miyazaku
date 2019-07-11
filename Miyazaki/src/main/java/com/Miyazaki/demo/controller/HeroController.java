package com.Miyazaki.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Miyazaki.demo.DAO.FilmDAO;
import com.Miyazaki.demo.DAO.HeroDAO;
import com.Miyazaki.demo.model.Film;
import com.Miyazaki.demo.model.Hero;

public class HeroController {
	@Autowired
	HeroDAO heroDAO;
	
	@GetMapping(value = "/getHeroId/{heroId}")
	public Hero getHeroId(@PathVariable int heroId) {
		
		Hero heroFound= heroDAO.findOne(heroId);
		return heroFound;
	}
	
	@GetMapping(value = "/getAllhero")
	public List<Hero> getAllhero() {
		
		List<Hero> heroFounds= heroDAO.findAll();
		return heroFounds;
	}
	
	@PostMapping(value = "/createHero")
	public Hero addHero(@RequestBody Hero hero) {
		
		Hero createdHero= heroDAO.save(hero);
		return createdHero;
		
	}
	
	@PutMapping(value = "/updateHero")
	public Hero updateHero(@RequestBody Hero hero) {
		
		Hero updateHero = heroDAO.save(hero);
		return updateHero;
	}
	
	@DeleteMapping(value = "/deleteByHeroId/{heroId}")
	public void deleteHeroById (@PathVariable int heroId) {
		
		heroDAO.deleteByHeroId(heroId);
	}
}
