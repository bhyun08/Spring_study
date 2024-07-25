package hello.shop_crud.domain.goods.service;


import hello.shop_crud.domain.goods.dto.request.GoodsDeleteRequest;
import hello.shop_crud.domain.goods.entity.GoodsEntity;
import hello.shop_crud.domain.goods.repository.GoodsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoodsDeleteService {
    private final GoodsRepository goodsRepository;

    public void delete(GoodsDeleteRequest goodsDeleteRequest) {
        GoodsEntity goodsEntity = goodsRepository.findById(goodsDeleteRequest.getId())
                .orElseThrow(() -> new IllegalArgumentException("Goods Not Found"));
        goodsRepository.delete(goodsEntity);
    }
}
