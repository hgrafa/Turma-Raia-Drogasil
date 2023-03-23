package com.resilia.marvel.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "powers")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Power {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "powers")
    private Set<Hero> heroes = new HashSet<>();
}
