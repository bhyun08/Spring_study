package hello.shop_crud.domain.goods.controller;

import hello.shop_crud.domain.goods.dto.request.GoodsDeleteRequest;
import hello.shop_crud.domain.goods.dto.response.GoodsCheckResponse;
import hello.shop_crud.domain.goods.dto.request.GoodsCheckRequest;
import hello.shop_crud.domain.goods.dto.request.GoodsRegisterRequest;
import hello.shop_crud.domain.goods.dto.request.GoodsUpdateRequest;
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
    public void register(@RequestBody GoodsRegisterRequest goodsRegisterRequest) {
        goodsRegisterService.register(goodsRegisterRequest);
    }

    @GetMapping("/check")
    public GoodsCheckResponse check(@RequestBody GoodsCheckRequest goodsCheckRequest) {
        return goodsCheckService.check(goodsCheckRequest);
    }

    @PatchMapping("/update")
    public void update(@RequestBody GoodsUpdateRequest updateRequest) {
        goodsUpdateService.update(updateRequest);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody GoodsDeleteRequest goodsDeleteRequest) {
        goodsDeleteService.delete(goodsDeleteRequest);
    }
}
