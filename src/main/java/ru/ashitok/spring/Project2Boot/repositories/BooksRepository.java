package ru.ashitok.spring.Project2Boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ashitok.spring.Project2Boot.models.Book;
import ru.ashitok.spring.Project2Boot.models.Person;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
    List<Book> findByOwner(Person person);
    List<Book> findBookByTitleStartingWith(String title);
}
