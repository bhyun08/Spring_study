package hello.shop_crud.domain.order.controller;

import hello.shop_crud.domain.order.dto.request.OrderCreateRequest;
import hello.shop_crud.domain.order.service.OrderCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderCreateService orderCreateService;

    @PostMapping("/create")
    public void createOrder(@RequestBody OrderCreateRequest orderCreateRequest) {
        orderCreateService.createOrder(orderCreateRequest);
    }
}
