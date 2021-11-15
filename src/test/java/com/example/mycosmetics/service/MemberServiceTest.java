package com.example.mycosmetics.service;

import com.example.mycosmetics.domain.member.Member;
import com.example.mycosmetics.domain.member.MemberRepository;
import com.example.mycosmetics.dto.member.MemberSignUpRequestDto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MemberServiceTest {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MemberService memberService;

    @AfterEach
    void cleanUp() {
        memberRepository.deleteAll();
    }

    @Test
    void 회원가입테스트() {
        // given
        String email = "gochi97@naver.com";
        String nickName = "토끼";
        String profileUrl = "sdfhsjdhfjsdfh.jpg";
        MemberSignUpRequestDto requestDto = new MemberSignUpRequestDto(email, nickName, profileUrl);

        // when
        memberService.signUp(requestDto);

        // then
        List<Member> member = memberRepository.findAll();
        assertThat(member).hasSize(1);
        assertThat(member.get(0).getEmail()).isEqualTo(email);
        assertThat(member.get(0).getNickName()).isEqualTo(nickName);
        assertThat(member.get(0).getProfileUrl()).isEqualTo(profileUrl);

    }
}
