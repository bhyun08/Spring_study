package hello.user_crud.domain.auth.service;

import hello.user_crud.domain.auth.dto.request.SignUpRequest;
import hello.user_crud.domain.auth.entity.User;
import hello.user_crud.domain.auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SignUpService {
    private final UserRepository userRepository;

    public void signUp(SignUpRequest signUpRequest) {
        Optional<User> user = userRepository.findByUsername(signUpRequest.getUsername());

        if (user.isPresent()) {
            throw new RuntimeException("Username is already in use");
        }

        userRepository.save(
                User.builder()
                        .username(signUpRequest.getUsername())
                        .password(signUpRequest.getPassword())
                        .email(signUpRequest.getEmail())
                        .phone(signUpRequest.getPhone())
                        .birth(signUpRequest.getBirth())
                        .build());
    }
}
