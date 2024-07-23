package hello.library_crud.domain.service;

import hello.library_crud.domain.dto.request.TitleRequest;
import hello.library_crud.domain.entity.BookEntity;
import hello.library_crud.domain.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BookSearchTitleService {
    private final BookRepository bookRepository;

    public List<BookEntity> findByTitle(TitleRequest titleRequest) {
        return bookRepository.findByTitle(titleRequest.getKeyword());
    }
}
