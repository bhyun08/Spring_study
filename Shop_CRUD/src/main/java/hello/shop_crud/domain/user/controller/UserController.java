package hello.shop_crud.domain.user.controller;

import hello.shop_crud.domain.user.dto.request.UserSignUpRequest;
import hello.shop_crud.domain.user.dto.request.UserUpdateRequest;
import hello.shop_crud.domain.user.service.UserSignUpService;
import hello.shop_crud.domain.user.service.UserUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserSignUpService userSignUpService;
    private final UserUpdateService userUpdateService;

    @PostMapping("/signup")
    public void signUp(@RequestBody UserSignUpRequest userSignUpRequest) {
        userSignUpService.signUp(userSignUpRequest);
    }

    @PatchMapping("/update")
    public void update(@RequestBody UserUpdateRequest userUpdateRequest) {
        userUpdateService.update(userUpdateRequest);
    }
}
