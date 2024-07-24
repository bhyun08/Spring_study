package hello.user_crud.domain.auth.controller;

import hello.user_crud.domain.auth.dto.request.SignUpRequest;
import hello.user_crud.domain.auth.service.CheckService;
import hello.user_crud.domain.auth.service.SignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final SignUpService signUpService;
    private final CheckService checkService;

    @PostMapping("/signup")
    public void signUp(@RequestBody SignUpRequest signUpRequest) {
        signUpService.signUp(signUpRequest);
    }

    @
}
