package com.turing.universe.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author ChenOT
 * @date 2020-02-11
 * @see
 * @since
 */
@Data
@TableName("t_book")
public class Book {
    private Long id;
    private String name;
}
