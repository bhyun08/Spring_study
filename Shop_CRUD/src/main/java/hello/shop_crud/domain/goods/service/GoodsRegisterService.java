package hello.shop_crud.domain.goods.service;

import hello.shop_crud.domain.goods.dto.request.RegisterRequest;
import hello.shop_crud.domain.goods.entity.GoodsEntity;
import hello.shop_crud.domain.goods.repository.GoodsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoodsRegisterService {
    private final GoodsRepository goodsRepository;

    public void register(RegisterRequest registerRequest) {
        goodsRepository.save(GoodsEntity.builder()
                        .goodsName(registerRequest.getGoodsName())
                        .goodsDesc(registerRequest.getGoodsDesc())
                        .goodsPrice(registerRequest.getGoodsPrice())
                .build());
    }
}
