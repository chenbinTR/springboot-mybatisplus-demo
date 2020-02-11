package com.turing.universe.controller;

import com.turing.universe.entity.Book;
import com.turing.universe.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChenOT
 * @date 2020-02-11
 * @see
 * @since
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping(value = "/findbook")
    public Book findBook(){
        return bookService.getById(38);
    }
}
