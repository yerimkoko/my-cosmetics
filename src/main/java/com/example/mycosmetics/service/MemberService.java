package com.example.mycosmetics.service;

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

        Member doubleCheckNickName = memberRepository.findByNickName(requestDto.getName());

        if (doubleCheckNickName != null) {
            throw new IllegalArgumentException(String.format("(%s)는 중복된 닉네임 입니다. 다른 닉네임을 입력해주세요!", requestDto.getName()));
        }

        Member member = memberRepository.save(Member.of(requestDto.getEmail(), requestDto.getName(), requestDto.getImageUrl()));

        return member.getId();
    }

}