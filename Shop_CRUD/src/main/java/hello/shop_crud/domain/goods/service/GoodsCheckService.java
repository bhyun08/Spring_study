package hello.shop_crud.domain.goods.service;

import hello.shop_crud.domain.goods.dto.response.CheckResponse;
import hello.shop_crud.domain.goods.dto.request.CheckRequest;
import hello.shop_crud.domain.goods.entity.GoodsEntity;
import hello.shop_crud.domain.goods.repository.GoodsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoodsCheckService {
    private final GoodsRepository goodsRepository;

    public CheckResponse check(CheckRequest checkRequest) {
        GoodsEntity goodsEntity = goodsRepository.findById(checkRequest.getId())
                .orElseThrow(()-> new IllegalArgumentException("Goods Not Found"));
        return new CheckResponse(goodsEntity.getGoodsName(), goodsEntity.getGoodsDesc(), goodsEntity.getGoodsPrice());
    }
}
