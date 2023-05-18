package com.green.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    private final BoardMapper mapper;

    @Autowired
    public BoardService(BoardMapper mapper) {
        this.mapper = mapper;
    }

    public int insBoard(BoardEntity entity) {
        System.out.println("service-insBoard");
        return mapper.insBoard(entity);
    }

    public int updBoard(BoardEntity entity) {
        return mapper.updBoard(entity);
    }
}
