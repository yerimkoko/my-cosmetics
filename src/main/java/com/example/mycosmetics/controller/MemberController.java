package com.example.mycosmetics.controller;

import com.example.mycosmetics.ApiResponse;
import com.example.mycosmetics.dto.member.MemberSignUpRequestDto;
import com.example.mycosmetics.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    private final HttpSession httpSession;

    @PostMapping("/api/v1/sign-up")
    public ApiResponse<String> signUp(@RequestBody MemberSignUpRequestDto requestDto) {
        Long memberId = memberService.signUp(requestDto);
        httpSession.setAttribute("memberId", memberId);
        return ApiResponse.success(httpSession.getId());
    }

}
