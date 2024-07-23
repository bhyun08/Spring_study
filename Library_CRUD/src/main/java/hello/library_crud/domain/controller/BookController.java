package hello.library_crud.domain.controller;

import hello.library_crud.domain.dto.request.OneReadRequest;
import hello.library_crud.domain.dto.request.RegisterRequest;
import hello.library_crud.domain.dto.response.OneReadResponse;
import hello.library_crud.domain.service.BookOneReadService;
import hello.library_crud.domain.service.BookRegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookRegisterService bookRegisterService;
    private final BookOneReadService bookOneReadService;

    @PostMapping("/register")
    public void register(@RequestBody RegisterRequest registerRequest) {
        bookRegisterService.register(registerRequest);
    }

    @GetMapping("/oneRead")
    public OneReadResponse oneRead(@RequestBody OneReadRequest oneReadRequest) {
        return bookOneReadService.oneRead(oneReadRequest);
    }
}
