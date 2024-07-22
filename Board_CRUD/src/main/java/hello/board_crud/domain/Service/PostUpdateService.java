package hello.board_crud.domain.Service;

import hello.board_crud.domain.Dto.Request.UpdateRequest;
import hello.board_crud.domain.Entity.PostEntity;
import hello.board_crud.domain.Repository.PostRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Transactional
@Service
public class PostUpdateService {
    private final PostRepository postRepository;

    public void update(UpdateRequest updateRequest) {
        PostEntity postEntity = postRepository.findById(updateRequest.getId()).orElseThrow(RuntimeException::new);
        postEntity.setTitle(updateRequest.getTitle());
        postEntity.setContent(updateRequest.getContent());
    }
}
