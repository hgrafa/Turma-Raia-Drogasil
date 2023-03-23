package com.resilia.marvel.repository;

import com.resilia.marvel.domain.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository
    extends JpaRepository<Team, Long> {
}
