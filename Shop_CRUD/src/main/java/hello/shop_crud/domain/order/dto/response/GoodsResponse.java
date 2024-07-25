package hello.shop_crud.domain.order.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GoodsResponse {
    private Long id;
    private String name;
    private double price;
}
