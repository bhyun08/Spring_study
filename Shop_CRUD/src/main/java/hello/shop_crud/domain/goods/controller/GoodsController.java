package hello.shop_crud.domain.goods.controller;

import hello.shop_crud.domain.goods.dto.request.RegisterRequest;
import hello.shop_crud.domain.goods.service.GoodsRegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
@RequiredArgsConstructor
public class GoodsController {
    private final GoodsRegisterService goodsRegisterService;

    @PostMapping("/register")
    public void register(@RequestBody  RegisterRequest registerRequest) {
        goodsRegisterService.register(registerRequest);
    }
    
}
