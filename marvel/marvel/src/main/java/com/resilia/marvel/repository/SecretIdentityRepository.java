package com.resilia.marvel.repository;

import com.resilia.marvel.domain.model.SecretIndetity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretIdentityRepository
    extends JpaRepository<SecretIndetity, Long> {
}
