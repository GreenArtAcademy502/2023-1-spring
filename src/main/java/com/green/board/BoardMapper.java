package com.green.board;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    int insBoard(BoardEntity entity);
    int updBoard(BoardEntity entity);
}
