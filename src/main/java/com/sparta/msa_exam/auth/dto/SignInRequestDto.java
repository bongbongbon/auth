package com.sparta.msa_exam.auth.dto;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignInRequestDto {

    private String username;

    private String password;

}
