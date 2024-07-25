package hello.shop_crud.domain.order.service;

import hello.shop_crud.domain.goods.entity.GoodsEntity;
import hello.shop_crud.domain.goods.repository.GoodsRepository;
import hello.shop_crud.domain.order.dto.response.GoodsResponse;
import hello.shop_crud.domain.order.entity.OrderEntity;
import hello.shop_crud.domain.order.repository.OrderRepository;
import hello.shop_crud.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderQueryService {
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final GoodsRepository goodsRepository;

    public Set<GoodsResponse> getOrderedGoodsByUserId(Long userId) {
        List<OrderEntity> orders = orderRepository.findByUserEntityId(userId);
        Set<GoodsEntity> orderedGoods = new HashSet<>();


        for (OrderEntity order : orders) {
            orderedGoods.addAll(order.getGoodsEntitySet());
        }

        return orderedGoods.stream()
                .map(this::mapToGoodsResponse)
                .collect(Collectors.toSet());
    }
    private GoodsResponse mapToGoodsResponse(GoodsEntity goodsEntity) {
        return new GoodsResponse(
                goodsEntity.getGoodsId(),
                goodsEntity.getGoodsName(),
                goodsEntity.getGoodsPrice());
    }
}
