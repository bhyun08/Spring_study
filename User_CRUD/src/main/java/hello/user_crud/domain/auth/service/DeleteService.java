package hello.user_crud.domain.auth.service;

import hello.user_crud.domain.auth.dto.request.DeleteRequest;
import hello.user_crud.domain.auth.entity.User;
import hello.user_crud.domain.auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteService {
    private final UserRepository userRepository;

    public void delete(DeleteRequest deleteRequest) {
        User user = userRepository.findById(deleteRequest.getId())
                .orElseThrow(()-> new IllegalArgumentException("User not found"));
        userRepository.delete(user);
    }
}
