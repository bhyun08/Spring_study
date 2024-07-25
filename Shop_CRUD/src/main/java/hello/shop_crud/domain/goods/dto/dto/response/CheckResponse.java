package hello.shop_crud.domain.goods.dto.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CheckResponse {
    private String goodsName;
    private String goodsDesc;
    private int goodsPrice;
}
