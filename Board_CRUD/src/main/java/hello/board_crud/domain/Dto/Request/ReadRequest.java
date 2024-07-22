package hello.board_crud.domain.Dto.Request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ReadRequest {

    @NotBlank
    private int page;

    @NotBlank
    private int size;
}
