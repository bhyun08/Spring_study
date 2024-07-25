package hello.shop_crud.domain.user.service;

import hello.shop_crud.domain.user.dto.request.UserDeleteRequest;
import hello.shop_crud.domain.user.entity.UserEntity;
import hello.shop_crud.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDeleteService {
    private final UserRepository userRepository;

    public void delete(UserDeleteRequest userDeleteRequest) {
        UserEntity userEntity = userRepository.findById(userDeleteRequest.getId())
                .orElseThrow(() -> new IllegalArgumentException("User Not Found"));
        userRepository.delete(userEntity);
    }
}
