package hello.shop_crud.domain.user.service;

import hello.shop_crud.domain.user.dto.request.UserSignUpRequest;
import hello.shop_crud.domain.user.entity.UserEntity;
import hello.shop_crud.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserSignUpService {
    private final UserRepository userRepository;

    public void signUp(UserSignUpRequest userSignUpRequest) {
        Optional<UserEntity> userEntity = userRepository.findByUserId(userSignUpRequest.getUserid());

        if (userEntity.isPresent()) {
            throw new RuntimeException("UserId is already in use");
        }

        if (userRepository.findByEmail(userSignUpRequest.getEmail()).isPresent()) {
            throw new RuntimeException("Email is already in use");
        }

        userRepository.save(UserEntity.builder()
                        .userid(userSignUpRequest.getUserid())
                        .username(userSignUpRequest.getUsername())
                        .password(userSignUpRequest.getPassword())
                        .email(userSignUpRequest.getEmail())
                .build());
    }
}
