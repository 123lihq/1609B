package com.jk.controller.book;

import com.jk.pojo.book.Book;
import com.jk.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/book/")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("insertBookInfo")
    public String insertBookInfo(Book book) {
        bookService.insertBookInfo(book);
        return "book/book_list";
    }
}
