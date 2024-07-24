package hello.user_crud.domain.auth.service;

import hello.user_crud.domain.auth.dto.request.CheckRequest;
import hello.user_crud.domain.auth.dto.response.CheckResponse;
import hello.user_crud.domain.auth.entity.User;
import hello.user_crud.domain.auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CheckService {
    private final UserRepository userRepository;

    public CheckResponse check(CheckRequest checkRequest) {
        User user = userRepository.findById(checkRequest.getId())
                .orElseThrow(()->new RuntimeException("User Not Found"));
        return new CheckResponse(
                user.getUsername(),
                user.getEmail(),
                user.getPhone(),
                user.getBirth());
    }
}
