package hello.library_crud.domain.service;

import hello.library_crud.domain.dto.request.SearchRequest;
import hello.library_crud.domain.entity.BookEntity;
import hello.library_crud.domain.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookSearchService {
    private final BookRepository bookRepository;

    public List<BookEntity> search(SearchRequest searchRequest) {
        return bookRepository.findByAuthor(searchRequest.getKeyword());
    }
}
