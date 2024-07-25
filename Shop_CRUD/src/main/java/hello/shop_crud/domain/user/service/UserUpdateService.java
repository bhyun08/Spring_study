package hello.shop_crud.domain.user.service;

import hello.shop_crud.domain.user.dto.request.UserUpdateRequest;
import hello.shop_crud.domain.user.entity.UserEntity;
import hello.shop_crud.domain.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class UserUpdateService {
    private final UserRepository userRepository;

    public void update(UserUpdateRequest userUpdateRequest) {
        UserEntity userEntity = userRepository.findById(userUpdateRequest.getId())
                .orElseThrow(() -> new IllegalArgumentException("User Not Found"));
        userEntity.setUserid(userUpdateRequest.getUserid());
        userEntity.setUsername(userUpdateRequest.getUsername());
        userEntity.setPassword(userUpdateRequest.getPassword());
        userEntity.setEmail(userUpdateRequest.getEmail());
    }
}
