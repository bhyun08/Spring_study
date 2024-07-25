package hello.shop_crud.domain.user.service;

import hello.shop_crud.domain.user.dto.request.SignUpRequest;
import hello.shop_crud.domain.user.entity.UserEntity;
import hello.shop_crud.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserSignUpService {
    private final UserRepository userRepository;

    public void signUp(SignUpRequest signUpRequest) {
        Optional<UserEntity> userEntity = userRepository.findByUserId(signUpRequest.getUserid());

        if (userEntity.isPresent()) {
            throw new RuntimeException("UserId is already in use");
        }

        if (userRepository.findByEmail(signUpRequest.getEmail()).isPresent()) {
            throw new RuntimeException("Email is already in use");
        }

        userRepository.save(UserEntity.builder()
                        .userid(signUpRequest.getUserid())
                        .username(signUpRequest.getUsername())
                        .password(signUpRequest.getPassword())
                        .email(signUpRequest.getEmail())
                .build());
    }
}
