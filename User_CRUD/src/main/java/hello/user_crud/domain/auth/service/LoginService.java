package hello.user_crud.domain.auth.service;

import hello.user_crud.domain.auth.dto.request.LoginRequest;
import hello.user_crud.domain.auth.dto.response.LoginResponse;
import hello.user_crud.domain.auth.entity.User;
import hello.user_crud.domain.auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final UserRepository userRepository;

    public LoginResponse login(LoginRequest loginRequest) {
        User user = userRepository.findByUsername(loginRequest.getUsername())
                .orElseThrow(() -> new IllegalArgumentException("Not Found Username"));

        if (!user.getPassword().equals(loginRequest.getPassword())) {
            throw new IllegalArgumentException("Wrong Password");
        }

        return new LoginResponse(user.getUsername(), "temporary token");
    }
}
