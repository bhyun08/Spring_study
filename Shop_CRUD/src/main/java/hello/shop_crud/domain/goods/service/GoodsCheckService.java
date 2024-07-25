package hello.shop_crud.domain.goods.service;

import hello.shop_crud.domain.goods.dto.response.GoodsCheckResponse;
import hello.shop_crud.domain.goods.dto.request.GoodsCheckRequest;
import hello.shop_crud.domain.goods.entity.GoodsEntity;
import hello.shop_crud.domain.goods.repository.GoodsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoodsCheckService {
    private final GoodsRepository goodsRepository;

    public GoodsCheckResponse check(GoodsCheckRequest goodsCheckRequest) {
        GoodsEntity goodsEntity = goodsRepository.findById(goodsCheckRequest.getId())
                .orElseThrow(()-> new IllegalArgumentException("Goods Not Found"));
        return new GoodsCheckResponse(goodsEntity.getName(), goodsEntity.getDescription(), goodsEntity.getPrice());
    }
}
