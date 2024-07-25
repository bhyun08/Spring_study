package hello.shop_crud.domain.order.entity;

import hello.shop_crud.domain.goods.entity.GoodsEntity;
import hello.shop_crud.domain.user.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private UserEntity userEntity;

    @ManyToMany
    @JoinTable(
            name = "orderGoods",
            joinColumns = @JoinColumn(name = "orderId"),
            inverseJoinColumns = @JoinColumn(name = "goodsId")
    )
    private Set<GoodsEntity> goodsEntitySet = new HashSet<>();
}
