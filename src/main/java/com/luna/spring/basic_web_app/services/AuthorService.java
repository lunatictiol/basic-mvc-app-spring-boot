package com.luna.spring.basic_web_app.services;

import com.luna.spring.basic_web_app.domain.Author;

public interface AuthorService {
     Iterable<Author> getAllAuthors();
}
