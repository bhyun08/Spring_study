package hello.shop_crud.domain.order.service;

import hello.shop_crud.domain.goods.entity.GoodsEntity;
import hello.shop_crud.domain.goods.repository.GoodsRepository;
import hello.shop_crud.domain.order.dto.request.OrderCreateRequest;
import hello.shop_crud.domain.order.entity.OrderEntity;
import hello.shop_crud.domain.order.repository.OrderRepository;
import hello.shop_crud.domain.user.entity.UserEntity;
import hello.shop_crud.domain.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class OrderCreateService {
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final GoodsRepository goodsRepository;

    @Transactional
    public void createOrder(OrderCreateRequest orderCreateRequest) {
        UserEntity userEntity = userRepository.findById(orderCreateRequest.getUserId())
                .orElseThrow(() -> new RuntimeException("User Not Found"));

        Iterable<GoodsEntity> productsIterable = goodsRepository.findAllById(orderCreateRequest.getProductIds());
        List<GoodsEntity> products = StreamSupport.stream(productsIterable.spliterator(), false)
                .collect(Collectors.toList());

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setUserEntity(userEntity);

        Set<GoodsEntity> productSet = new HashSet<>(products);
        orderEntity.setGoodsEntitySet(productSet);

        orderRepository.save(orderEntity);
    }
}
