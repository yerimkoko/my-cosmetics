package com.example.mycosmetics.domain.member;


import com.example.mycosmetics.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String oauthId;

    private String email;

    private String name;

    private String imageUrl;


    @Enumerated(EnumType.STRING)
    private Role role;

    protected Member() {

    }


    @Builder
    public Member(String oauthId, String name, String email, String imageUrl, Role role) {
        this.oauthId = oauthId;
        this.name = name;
        this.email = email;
        this.imageUrl = imageUrl;

    }

    public static Member of(String email, String name, String imageUrl) {
        return Member.builder()
                .email(email)
                .name(name)
                .imageUrl(imageUrl)
                .oauthId(null)
                .build();
    }
}