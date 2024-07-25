package hello.shop_crud.domain.goods.repository;

import hello.shop_crud.domain.goods.entity.GoodsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsRepository extends CrudRepository<GoodsEntity, Long> {
}
