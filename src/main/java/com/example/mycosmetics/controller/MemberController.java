package com.example.mycosmetics.controller;

import com.example.mycosmetics.ApiResponse;
import com.example.mycosmetics.dto.member.MemberSignUpRequestDto;
import com.example.mycosmetics.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/api/v1/sign-up")
    public ApiResponse<Long> signUp(MemberSignUpRequestDto requestDto) {
        return ApiResponse.success(memberService.signUp(requestDto));
    }

}
