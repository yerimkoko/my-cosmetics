package com.example.mycosmetics.dto.member;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberSignUpRequestDto {
    private String email;

    private String nickName;

    private String profileUrl;

    public MemberSignUpRequestDto(String email, String nickName, String profileUrl) {
        this.email = email;
        this.nickName = nickName;
        this.profileUrl = profileUrl;
    }


}
