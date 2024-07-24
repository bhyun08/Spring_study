package hello.user_crud.domain.auth.service;

import hello.user_crud.domain.auth.dto.request.UpdateRequest;
import hello.user_crud.domain.auth.entity.User;
import hello.user_crud.domain.auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UpdateService {
    private final UserRepository userRepository;

    public void update(UpdateRequest updateRequest) {
        User user = userRepository.findById(updateRequest.getId())
                .orElseThrow(() -> new RuntimeException("user not found"));
        user.setUsername(updateRequest.getUsername());
        user.setPassword(updateRequest.getPassword());
        user.setEmail(updateRequest.getEmail());
        user.setPhone(updateRequest.getPhone());
        user.setBirth(updateRequest.getBirth());
    }
}
