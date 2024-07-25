package hello.shop_crud.domain.goods.entity;

import jakarta.persistence.*;
import lombok.*;

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
}
