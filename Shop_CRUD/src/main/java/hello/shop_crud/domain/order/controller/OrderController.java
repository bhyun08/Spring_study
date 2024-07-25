package hello.shop_crud.domain.order.controller;

import hello.shop_crud.domain.order.dto.request.OrderCreateRequest;
import hello.shop_crud.domain.order.dto.response.GoodsResponse;
import hello.shop_crud.domain.order.service.OrderCreateService;
import hello.shop_crud.domain.order.service.OrderQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderCreateService orderCreateService;
    private final OrderQueryService orderQueryService;

    @PostMapping("/create")
    public void createOrder(@RequestBody OrderCreateRequest orderCreateRequest) {
        orderCreateService.createOrder(orderCreateRequest);
    }

    @GetMapping("/user/{userId}/goods")
    public Set<GoodsResponse> getOrderedGoodsByUserId(@PathVariable Long userId) {
        return orderQueryService.getOrderedGoodsByUserId(userId);
    }
}
