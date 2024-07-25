package hello.shop_crud.domain.goods.dto.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegisterRequest {

    @Size(min = 2, max = 50)
    @NotBlank
    private String goodsName;

    @NotBlank
    private int goodsDesc;

    @Size(max = 1000)
    private String goodsExplan;
}
