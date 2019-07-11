package com.Miyazaki.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Miyazaki.demo.model.Hero;

@Repository
public interface HeroDAO extends JpaRepository<Hero, Integer> {

	void deleteByHeroId(int heroId);

		
}
