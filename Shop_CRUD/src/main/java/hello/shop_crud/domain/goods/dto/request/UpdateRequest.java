package hello.shop_crud.domain.goods.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateRequest {

    @Size(min = 1)
    @NotBlank
    private Long id;

    @Size(min = 2, max = 50)
    @NotBlank
    private String goodsName;

    @Size(max = 1000)
    @NotBlank
    private String goodsDesc;

    @NotBlank
    private int goodsPrice;
}
