package springboot.ecommarce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.ecommarce.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
