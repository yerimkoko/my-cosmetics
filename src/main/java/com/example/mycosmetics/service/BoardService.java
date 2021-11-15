package com.example.mycosmetics.service;

import com.example.mycosmetics.domain.category.CategoryRepository;
import com.example.mycosmetics.domain.board.Board;
import com.example.mycosmetics.domain.board.BoardRepository;
import com.example.mycosmetics.dto.board.BoardRequestDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
@Getter
public class BoardService {

    private final BoardRepository boardRepository;

    private final CategoryRepository categoryRepository;

    @Transactional
    public Board save(BoardRequestDto dto) {
        Board board = boardRepository.save(dto.toEntity());
        return board;
    }
    
}
