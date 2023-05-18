package com.green.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService service;

    @Autowired
    public BoardController(BoardService service) {
        this.service = service;
    }

    @PostMapping
    public int boardPost(@RequestBody BoardEntity entity) {
        System.out.println(entity);
        return service.insBoard(entity);
    }

    @PutMapping
    public int boardPut(@RequestBody BoardEntity entity) {
        System.out.println(entity);
        return service.updBoard(entity);
    }
}
