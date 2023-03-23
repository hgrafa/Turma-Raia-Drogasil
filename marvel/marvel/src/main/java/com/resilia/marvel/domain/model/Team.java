package com.resilia.marvel.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "teams")
@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "team", fetch = FetchType.LAZY)
    private Set<Hero> heroes = new HashSet<>();

}
