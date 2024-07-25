package hello.shop_crud.domain.goods.controller;

import hello.shop_crud.domain.goods.dto.dto.response.CheckResponse;
import hello.shop_crud.domain.goods.dto.request.CheckRequest;
import hello.shop_crud.domain.goods.dto.request.RegisterRequest;
import hello.shop_crud.domain.goods.service.GoodsCheckService;
import hello.shop_crud.domain.goods.service.GoodsRegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goods")
@RequiredArgsConstructor
public class GoodsController {
    private final GoodsRegisterService goodsRegisterService;
    private final GoodsCheckService goodsCheckService;

    @PostMapping("/register")
    public void register(@RequestBody  RegisterRequest registerRequest) {
        goodsRegisterService.register(registerRequest);
    }

    @GetMapping("/check")
    public CheckResponse check(@RequestBody CheckRequest checkRequest) {
        return goodsCheckService.check(checkRequest);
    }
}
