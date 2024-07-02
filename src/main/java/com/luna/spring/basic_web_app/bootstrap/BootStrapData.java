package com.luna.spring.basic_web_app.bootstrap;

import com.luna.spring.basic_web_app.domain.Author;
import com.luna.spring.basic_web_app.domain.Book;
import com.luna.spring.basic_web_app.domain.Publisher;
import com.luna.spring.basic_web_app.repository.AuthorRepository;
import com.luna.spring.basic_web_app.repository.BookRepository;
import com.luna.spring.basic_web_app.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher penguin = new Publisher();
        penguin.setAddress("somewhere in the north");
        penguin.setName("Penguin Inc");
        penguin.setState("cold state");
        penguin.setZip("91169");
        penguin.setCity("ice city");

        Publisher penguinSaved = publisherRepository.save(penguin);

        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Ivan");

        Book ddd = new Book();

        ddd.setTitle("Domain driven design");
        ddd.setIbn("122222");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Ivanov");


        Book noJEB = new Book();

        noJEB.setTitle("NoJEB");
        noJEB.setIbn("1234457");

        Author rodSaved = authorRepository.save(rod);
        Book noJEBSaved = bookRepository.save(noJEB);

         ericSaved.getBooks().add(dddSaved);
         rodSaved.getBooks().add(noJEBSaved);
         dddSaved.getAuthors().add(ericSaved);
         noJEBSaved.getAuthors().add(rodSaved);
         dddSaved.setPublisher(penguinSaved);
         noJEBSaved.setPublisher(penguinSaved);
        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(noJEBSaved);


        System.out.println("In boot Strap");
        System.out.println("Author: " + authorRepository.count());
        System.out.println("Book: " + bookRepository.count());
        System.out.println("Publisher: " + publisherRepository.count());

    }
}
