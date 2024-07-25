package hello.shop_crud.domain.goods.service;

import hello.shop_crud.domain.goods.dto.request.DeleteRequest;
import hello.shop_crud.domain.goods.entity.GoodsEntity;
import hello.shop_crud.domain.goods.repository.GoodsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoodsDeleteService {
    private final GoodsRepository goodsRepository;

    public void delete(DeleteRequest deleteRequest) {
        GoodsEntity goodsEntity = goodsRepository.findById(deleteRequest.getId())
                .orElseThrow(() -> new IllegalArgumentException("Goods Not Found"));
        goodsRepository.delete(goodsEntity);
    }
}
