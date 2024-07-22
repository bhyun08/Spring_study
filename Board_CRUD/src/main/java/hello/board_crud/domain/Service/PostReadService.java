package hello.board_crud.domain.Service;

import hello.board_crud.domain.Dto.Request.ReadRequest;
import hello.board_crud.domain.Entity.PostEntity;
import hello.board_crud.domain.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostReadService {
    private final PostRepository postRepository;

    public Page<PostEntity> find(ReadRequest readRequest) {
        Pageable pageable = PageRequest.of(readRequest.getPage(), readRequest.getSize());
        return postRepository.findAll(pageable);
    }
}
