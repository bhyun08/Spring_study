package hello.user_crud.domain.auth.controller;

import hello.user_crud.domain.auth.dto.request.CheckRequest;
import hello.user_crud.domain.auth.dto.request.DeleteRequest;
import hello.user_crud.domain.auth.dto.request.SignUpRequest;
import hello.user_crud.domain.auth.dto.request.UpdateRequest;
import hello.user_crud.domain.auth.dto.response.CheckResponse;
import hello.user_crud.domain.auth.service.CheckService;
import hello.user_crud.domain.auth.service.DeleteService;
import hello.user_crud.domain.auth.service.SignUpService;
import hello.user_crud.domain.auth.service.UpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final SignUpService signUpService;
    private final CheckService checkService;
    private final UpdateService updateService;
    private final DeleteService deleteService;

    @PostMapping("/signup")
    public void signUp(@RequestBody SignUpRequest signUpRequest) {
        signUpService.signUp(signUpRequest);
    }

    @GetMapping("/check")
    public CheckResponse check(@RequestBody CheckRequest checkRequest) {
        return checkService.check(checkRequest);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateRequest updateRequest) {
        updateService.update(updateRequest);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody DeleteRequest deleteRequest) {
        deleteService.delete(deleteRequest);
    }
}
