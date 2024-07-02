package com.luna.spring.basic_web_app.services;

import com.luna.spring.basic_web_app.domain.Book;

public interface BookService  {

    Iterable<Book> getAllBooks();
}
