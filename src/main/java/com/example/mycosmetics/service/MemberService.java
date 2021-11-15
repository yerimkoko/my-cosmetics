package com.example.mycosmetics.service;

import com.example.mycosmetics.ApiResponse;
import com.example.mycosmetics.domain.member.Member;
import com.example.mycosmetics.domain.member.MemberRepository;
import com.example.mycosmetics.dto.member.MemberSignUpRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public Long signUp(MemberSignUpRequestDto requestDto) {
        Member member = memberRepository.save(Member.of(requestDto.getEmail(), requestDto.getNickName(), requestDto.getProfileUrl()));
        return member.getId();
    }

}