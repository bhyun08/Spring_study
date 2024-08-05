package hello.jwt_practice.domain.auth.service;

import hello.jwt_practice.domain.auth.dto.request.SignUpRequest;
import hello.jwt_practice.domain.user.entity.UserEntity;
import hello.jwt_practice.domain.user.repository.UserRepository;
import hello.jwt_practice.global.exception.GlobalException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignUpService {
    private final UserRepository userRepository;

    public void signUp(SignUpRequest signUpRequest) {
        UserEntity userEntity = userRepository.findByUsername(signUpRequest.getAccountId());
        if (userEntity != null) {
            throw new GlobalException(HttpStatus.CONFLICT, "User already exists");
        }

        userRepository.save(
                UserEntity.builder()
                        .accountId(signUpRequest.getAccountId())
                        .password(signUpRequest.getPassword())
                        .phoneNumber(signUpRequest.getPhone())
                        .build());
    }
}
