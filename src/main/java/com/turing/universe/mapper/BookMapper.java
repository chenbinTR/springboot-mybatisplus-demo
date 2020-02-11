package com.turing.universe.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.turing.universe.entity.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ChenOT
 * @date 2020-02-11
 * @see
 * @since
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {
}
