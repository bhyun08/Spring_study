package hello.library_crud.domain.controller;

import hello.library_crud.domain.dto.request.*;
import hello.library_crud.domain.dto.response.OneReadResponse;
import hello.library_crud.domain.entity.BookEntity;
import hello.library_crud.domain.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookRegisterService bookRegisterService;
    private final BookOneReadService bookOneReadService;
    private final BookUpdateService bookUpdateService;
    private final BookDeleteService bookDeleteService;
    private final BookSearchService bookSearchService;
    private final BookSearchTitleService bookSearchTitleService;

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

    @GetMapping("/author")
    public List<BookEntity> authorSearch(@RequestBody SearchRequest searchRequest) {
        return bookSearchService.search(searchRequest);
    }

    @GetMapping("/title")
    public List<BookEntity> titleSearch(@RequestBody TitleRequest titleRequest) {
        return bookSearchTitleService.searchTitle(titleRequest);
    }
}
