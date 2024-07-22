package hello.board_crud.domain.Controller;

import hello.board_crud.domain.Dto.Request.CreateRequest;
import hello.board_crud.domain.Dto.Request.DeleteRequest;
import hello.board_crud.domain.Dto.Request.ReadRequest;
import hello.board_crud.domain.Dto.Request.UpdateRequest;
import hello.board_crud.domain.Entity.PostEntity;
import hello.board_crud.domain.Service.PostCreateService;
import hello.board_crud.domain.Service.PostDeleteService;
import hello.board_crud.domain.Service.PostReadService;
import hello.board_crud.domain.Service.PostUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostController {
    private final PostCreateService postCreateService;
    private final PostReadService postReadService;
    private final PostUpdateService postUpdateService;
    private final PostDeleteService postDeleteService;

    @PostMapping("/write")
    public void createPost(@RequestBody CreateRequest createRequest) {
        postCreateService.PostCreate(createRequest);
    }

    @GetMapping("/paging")
    public Page<PostEntity> paging(@RequestBody ReadRequest readRequest) {
        return postReadService.find(readRequest);
    }

    @PatchMapping("/update")
    public void updatePost(@RequestBody UpdateRequest updateRequest) {
        postUpdateService.update(updateRequest);
    }

    @DeleteMapping("/delete")
    public void deletePost(@RequestBody DeleteRequest deleteRequest) {
        postDeleteService.delete(deleteRequest);
    }
}
