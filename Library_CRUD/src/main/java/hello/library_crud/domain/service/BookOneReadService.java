package hello.library_crud.domain.service;

import hello.library_crud.domain.dto.request.OneReadRequest;
import hello.library_crud.domain.dto.response.OneReadResponse;
import hello.library_crud.domain.entity.BookEntity;
import hello.library_crud.domain.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
@RequiredArgsConstructor
public class BookOneReadService {
    private final BookRepository bookRepository;

    public OneReadResponse oneRead(OneReadRequest oneReadRequest) {
        BookEntity bookEntity = bookRepository.findById(oneReadRequest.getId())
                .orElseThrow(() -> new RuntimeException("Book not found"));
        return new OneReadResponse(bookEntity.getId(), bookEntity.getTitle(), bookEntity.getAuthor());
    }
}
