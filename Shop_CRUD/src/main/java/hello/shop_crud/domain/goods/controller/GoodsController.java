package hello.shop_crud.domain.goods.controller;

import hello.shop_crud.domain.goods.dto.request.DeleteRequest;
import hello.shop_crud.domain.goods.dto.response.CheckResponse;
import hello.shop_crud.domain.goods.dto.request.CheckRequest;
import hello.shop_crud.domain.goods.dto.request.RegisterRequest;
import hello.shop_crud.domain.goods.dto.request.UpdateRequest;
import hello.shop_crud.domain.goods.service.GoodsCheckService;
import hello.shop_crud.domain.goods.service.GoodsDeleteService;
import hello.shop_crud.domain.goods.service.GoodsRegisterService;
import hello.shop_crud.domain.goods.service.GoodsUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goods")
@RequiredArgsConstructor
public class GoodsController {
    private final GoodsRegisterService goodsRegisterService;
    private final GoodsCheckService goodsCheckService;
    private final GoodsUpdateService goodsUpdateService;
    private final GoodsDeleteService goodsDeleteService;

    @PostMapping("/register")
    public void register(@RequestBody  RegisterRequest registerRequest) {
        goodsRegisterService.register(registerRequest);
    }

    @GetMapping("/check")
    public CheckResponse check(@RequestBody CheckRequest checkRequest) {
        return goodsCheckService.check(checkRequest);
    }

    @PatchMapping("/update")
    public void update(@RequestBody UpdateRequest updateRequest) {
        goodsUpdateService.update(updateRequest);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody DeleteRequest deleteRequest) {
        goodsDeleteService.delete(deleteRequest);
    }
}
