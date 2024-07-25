package hello.shop_crud.domain.goods.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GoodsCheckResponse {
    private String goodsName;
    private String goodsDesc;
    private int goodsPrice;
}
