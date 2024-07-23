package hello.library_crud.domain.service;

import hello.library_crud.domain.dto.request.UpdateRequest;
import hello.library_crud.domain.entity.BookEntity;
import hello.library_crud.domain.repository.BookRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class BookUpdateService {
    private final BookRepository bookRepository;

    public void update(UpdateRequest updateRequest) {
        BookEntity bookEntity = bookRepository.findById(updateRequest.getId())
                .orElseThrow(() -> new RuntimeException("Book not found"));
        bookEntity.setTitle(updateRequest.getTitle());
        bookEntity.setAuthor(updateRequest.getAuthor());
        bookEntity.setDate(updateRequest.getDate());
    }
}
