package hello.shop_crud.domain.goods.service;

import hello.shop_crud.domain.goods.dto.request.UpdateRequest;
import hello.shop_crud.domain.goods.entity.GoodsEntity;
import hello.shop_crud.domain.goods.repository.GoodsRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class GoodsUpdateService {
    private final GoodsRepository goodsRepository;

    public void update(UpdateRequest updateRequest) {
        GoodsEntity goodsEntity = goodsRepository.findById(updateRequest.getId())
                .orElseThrow(()-> new IllegalArgumentException("Goods Not Found"));
        goodsEntity.setGoodsName(updateRequest.getGoodsName());
        goodsEntity.setGoodsPrice(updateRequest.getGoodsPrice());
        goodsEntity.setGoodsDesc(updateRequest.getGoodsDesc());
    }
}
