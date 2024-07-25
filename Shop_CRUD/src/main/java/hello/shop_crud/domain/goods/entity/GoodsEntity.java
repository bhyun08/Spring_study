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
    private Long id;  // 변경됨

    @Column(nullable = false)
    private String name;  // 변경됨

    @Column(nullable = false)
    private String description;  // 변경됨

    @Column(nullable = false)
    private int price;

    @ManyToMany(mappedBy = "goodsEntitySet")
    private Set<OrderEntity> orderEntities = new HashSet<>();
}
