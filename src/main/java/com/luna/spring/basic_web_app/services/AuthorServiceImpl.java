package com.luna.spring.basic_web_app.services;

import com.luna.spring.basic_web_app.domain.Author;
import com.luna.spring.basic_web_app.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    private final AuthorRepository authorRepository;


    @Override
    public Iterable<Author> getAllAuthors() {
        return authorRepository.findAll();

    }
}
