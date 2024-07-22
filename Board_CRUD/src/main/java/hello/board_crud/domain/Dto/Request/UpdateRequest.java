package hello.board_crud.domain.Dto.Request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateRequest {

    private Long id;

    @Size(min = 2, max = 100)
    @NotBlank
    private String title;

    @Size(min = 1, max = 10000)
    @NotBlank
    private String content;
}
