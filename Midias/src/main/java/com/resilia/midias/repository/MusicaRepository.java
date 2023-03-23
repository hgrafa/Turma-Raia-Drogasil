package com.resilia.midias.repository;

import com.resilia.midias.domain.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicaRepository extends JpaRepository<Musica, Long> {

    List<Musica> findByNomeAndOrderByDurationAsc(String nome);
}
