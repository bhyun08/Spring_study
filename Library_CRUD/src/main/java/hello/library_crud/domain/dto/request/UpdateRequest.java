package hello.library_crud.domain.dto.request;

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
    private Long Id;

    @Size(min = 1, max = 100)
    @NotBlank
    private String title;

    @Size(min = 1, max = 100)
    @NotBlank
    private String author;

    @Size(min = 10, max = 10)
    @NotBlank
    private String date;
}
