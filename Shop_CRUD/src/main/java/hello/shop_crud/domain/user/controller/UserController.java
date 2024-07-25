package hello.shop_crud.domain.user.controller;

import hello.shop_crud.domain.user.dto.request.SignUpRequest;
import hello.shop_crud.domain.user.service.UserSignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserSignUpService userSignUpService;

    public void signUp(SignUpRequest signUpRequest) {
        userSignUpService.signUp(signUpRequest);
    }
}
