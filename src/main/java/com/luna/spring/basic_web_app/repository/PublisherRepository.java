package com.luna.spring.basic_web_app.repository;

import com.luna.spring.basic_web_app.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
