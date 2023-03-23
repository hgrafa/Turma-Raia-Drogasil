package com.resilia.marvel.domain.dto.request;

import lombok.*;

@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class CreateHeroDto {
    private String name;
    private SecretIdentityDto secretIdentity;
}
