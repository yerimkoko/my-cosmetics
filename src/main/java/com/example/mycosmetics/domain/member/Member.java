package com.example.mycosmetics.domain.member;


import com.example.mycosmetics.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity

public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String nickName;

    private String profileUrl;

    @Builder
    public Member(String email, String nickName, String profileUrl) {
        this.email = email;
        this.nickName = nickName;
        this.profileUrl = profileUrl;
    }

    public static Member of(String email, String nickName, String profileUrl) {
        return Member.builder()
                .email(email)
                .nickName(nickName)
                .profileUrl(profileUrl)
                .build();
    }
}