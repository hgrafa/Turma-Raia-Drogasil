package com.resilia.hugo.PersonalApp.model;

import lombok.*;

@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class PersonalTrainer {

    private Long id;
    private String name;
    private Integer experienceInYears;
    private String university;
    private String category;

}
