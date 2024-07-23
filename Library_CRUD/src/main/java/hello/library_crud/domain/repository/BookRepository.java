package hello.library_crud.domain.repository;

import hello.library_crud.domain.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Long> {
    List<BookEntity> findByAuthor(String author);
    List<BookEntity> findByTitle(String title);
}
