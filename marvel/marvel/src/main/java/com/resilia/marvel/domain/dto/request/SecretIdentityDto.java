package com.resilia.marvel.domain.dto.request;

import lombok.*;

@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class SecretIdentityDto {

    private String realName;
    private String password;
    private String city;
    private int age;
}
