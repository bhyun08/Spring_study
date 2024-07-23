package hello.library_crud.domain.service;

import hello.library_crud.domain.dto.request.RegisterRequest;
import hello.library_crud.domain.entity.BookEntity;
import hello.library_crud.domain.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BookRegisterService {
    private final BookRepository bookRepository;

    public void register(RegisterRequest request) {
        bookRepository.save(BookEntity.builder().
                title(request.getTitle()).
                author(request.getAuthor()).
                date(request.getDate()).
                build());
    }
}
