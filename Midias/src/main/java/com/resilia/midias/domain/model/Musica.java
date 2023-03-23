package com.resilia.midias.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Duration;

@Entity
@Table(name = "musicas")
@Getter @Setter
@NoArgsConstructor
public class Musica extends Midia {
    private String letra;
    private String autor;

    @Builder(builderMethodName = "musicaBuilder")
    public Musica(Long id, String nome, Duration duration, String letra, String autor) {
        super(id, nome, duration);
        this.letra = letra;
        this.autor = autor;
    }
}
