package hello.jwt_practice.domain.auth.controller;

import hello.jwt_practice.domain.auth.dto.request.SignUpRequest;
import hello.jwt_practice.domain.auth.service.SignUpService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final SignUpService signUpService;

    @PostMapping("/join")
    public void signUp(@RequestBody @Valid SignUpRequest signUpRequest) {
        signUpService.signUp(signUpRequest);
    }
}
