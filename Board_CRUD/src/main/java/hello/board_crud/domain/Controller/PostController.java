package hello.board_crud.domain.Controller;

import hello.board_crud.domain.Dto.CreateRequest;
import hello.board_crud.domain.Service.PostCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostController {
    private final PostCreateService postCreateService;

    @PostMapping("/write")
    public void createPost(@RequestBody CreateRequest createRequest) {
        postCreateService.PostCreate(createRequest);
    }
}
