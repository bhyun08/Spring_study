package hello.shop_crud.domain.goods.service;

import hello.shop_crud.domain.goods.dto.request.GoodsRegisterRequest;
import hello.shop_crud.domain.goods.entity.GoodsEntity;
import hello.shop_crud.domain.goods.repository.GoodsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoodsRegisterService {
    private final GoodsRepository goodsRepository;

    public void register(GoodsRegisterRequest goodsRegisterRequest) {
        goodsRepository.save(GoodsEntity.builder()
                        .goodsName(goodsRegisterRequest.getGoodsName())
                        .goodsDesc(goodsRegisterRequest.getGoodsDesc())
                        .goodsPrice(goodsRegisterRequest.getGoodsPrice())
                .build());
    }
}
