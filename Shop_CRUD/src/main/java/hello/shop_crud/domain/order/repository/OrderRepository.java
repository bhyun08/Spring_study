package hello.shop_crud.domain.order.repository;

import hello.shop_crud.domain.order.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, Long> {
    List<OrderEntity> findByUserEntityId(Long userId);
}
