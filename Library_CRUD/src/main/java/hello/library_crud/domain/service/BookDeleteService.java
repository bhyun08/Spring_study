package hello.library_crud.domain.service;

import hello.library_crud.domain.dto.request.DeleteRequest;
import hello.library_crud.domain.entity.BookEntity;
import hello.library_crud.domain.repository.BookRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookDeleteService {
    private final BookRepository bookRepository;

    public void delete(DeleteRequest deleteRequest) {
        BookEntity bookEntity = bookRepository.findById(deleteRequest.getId())
                .orElseThrow(()-> new RuntimeException("Book not found"));
        bookRepository.delete(bookEntity);
    }
}
