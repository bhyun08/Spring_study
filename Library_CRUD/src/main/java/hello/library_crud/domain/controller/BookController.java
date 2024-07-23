package hello.library_crud.domain.controller;

import hello.library_crud.domain.dto.request.RegisterRequest;
import hello.library_crud.domain.service.BookRegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookRegisterService bookRegisterService;

    public void register(RegisterRequest registerRequest) {
        bookRegisterService.register(registerRequest);
    }

    
}
