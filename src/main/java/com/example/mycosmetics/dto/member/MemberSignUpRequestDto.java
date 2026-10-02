package com.example.mycosmetics.dto.member;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberSignUpRequestDto {
    private String email;

    private String name;

    private String imageUrl;

    public MemberSignUpRequestDto(String email, String name, String profileUrl) {
        this.email = email;
        this.name = name;
        this.imageUrl = profileUrl;
    }


}
