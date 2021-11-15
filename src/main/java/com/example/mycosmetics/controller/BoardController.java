package com.example.mycosmetics.controller;

import com.example.mycosmetics.dto.board.BoardRequestDto;
import com.example.mycosmetics.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService service;

    @PostMapping("/api/v1/board")
    public Long save (@RequestBody BoardRequestDto dto) {
        return service.save(dto).getId();
    }

}
