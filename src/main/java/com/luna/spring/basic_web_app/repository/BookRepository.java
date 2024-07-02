package com.luna.spring.basic_web_app.repository;

import com.luna.spring.basic_web_app.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {


}
