package hello.library_crud.domain.controller;

import hello.library_crud.domain.dto.request.DeleteRequest;
import hello.library_crud.domain.dto.request.OneReadRequest;
import hello.library_crud.domain.dto.request.RegisterRequest;
import hello.library_crud.domain.dto.request.UpdateRequest;
import hello.library_crud.domain.dto.response.OneReadResponse;
import hello.library_crud.domain.service.BookDeleteService;
import hello.library_crud.domain.service.BookOneReadService;
import hello.library_crud.domain.service.BookRegisterService;
import hello.library_crud.domain.service.BookUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookRegisterService bookRegisterService;
    private final BookOneReadService bookOneReadService;
    private final BookUpdateService bookUpdateService;
    private final BookDeleteService bookDeleteService;

    @PostMapping("/register")
    public void register(@RequestBody RegisterRequest registerRequest) {
        bookRegisterService.register(registerRequest);
    }

    @GetMapping("/oneRead")
    public OneReadResponse oneRead(@RequestBody OneReadRequest oneReadRequest) {
        return bookOneReadService.oneRead(oneReadRequest);
    }

    @PatchMapping("/update")
    public void update(@RequestBody UpdateRequest updateRequest) {
        bookUpdateService.update(updateRequest);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody DeleteRequest deleteRequest) {
        bookDeleteService.delete(deleteRequest);
    }
}
