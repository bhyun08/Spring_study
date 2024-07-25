package hello.shop_crud.domain.goods.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GoodsDeleteRequest {

    @Size(min = 1)
    @NotBlank
    private Long id;
}
