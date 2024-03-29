package com.resilia.marvel.repository;

import com.resilia.marvel.domain.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository
        extends JpaRepository<Hero, Long> {

}
