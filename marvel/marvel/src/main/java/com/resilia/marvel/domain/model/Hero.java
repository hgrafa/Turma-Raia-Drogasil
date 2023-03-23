package com.resilia.marvel.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "superheroes")
@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private SecretIndetity secretIndetity;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "hero_power",
            joinColumns = @JoinColumn(name = "hero_id"),
            inverseJoinColumns = @JoinColumn(name="power_id")
    )
    private Set<Power> powers = new HashSet<>();

}
