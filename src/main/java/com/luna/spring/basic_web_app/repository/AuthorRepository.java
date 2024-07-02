package com.luna.spring.basic_web_app.repository;

import com.luna.spring.basic_web_app.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
