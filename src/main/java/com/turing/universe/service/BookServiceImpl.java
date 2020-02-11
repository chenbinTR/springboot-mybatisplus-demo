package com.turing.universe.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.turing.universe.entity.Book;
import com.turing.universe.mapper.BookMapper;
import org.springframework.stereotype.Service;

/**
 * @author ChenOT
 * @date 2020-02-11
 * @see
 * @since
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {
}
