package hello.board_crud.domain.Service;

import hello.board_crud.domain.Dto.Request.DeleteRequest;
import hello.board_crud.domain.Entity.PostEntity;
import hello.board_crud.domain.Repository.PostRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class PostDeleteService {
    private final PostRepository postRepository;

    public void delete(DeleteRequest deleteRequest) {
        PostEntity postEntity = postRepository.findById(deleteRequest.getId()).orElseThrow(RuntimeException::new);
        postRepository.delete(postEntity);
    }
}
