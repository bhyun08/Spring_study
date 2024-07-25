package hello.shop_crud.domain.goods.entity;

import hello.shop_crud.domain.order.entity.OrderEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GoodsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long GoodsId;

    @Column(nullable = false)
    private String goodsName;

    @Column(nullable = false)
    private String goodsDesc;

    @Column(nullable = false)
    private int goodsPrice;

    @ManyToMany(mappedBy = "goods")
    private Set<OrderEntity> orderEntities = new HashSet<>();
}
