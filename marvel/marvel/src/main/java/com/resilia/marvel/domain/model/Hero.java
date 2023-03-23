package com.resilia.marvel.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "superheroes")
@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String realName;

}
