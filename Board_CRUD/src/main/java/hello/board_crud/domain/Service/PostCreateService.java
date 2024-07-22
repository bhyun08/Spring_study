package hello.board_crud.domain.Service;

import hello.board_crud.domain.Dto.CreateRequest;
import hello.board_crud.domain.Entity.PostEntity;
import hello.board_crud.domain.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostCreateService {
    private final PostRepository postRepository;

    public void PostCreate(CreateRequest createRequest) {
        postRepository.save(
                PostEntity.builder()
                        .title(createRequest.getTitle())
                        .writerName(createRequest.getName())
                        .content(createRequest.getContent())
                        .build());
    }
}
