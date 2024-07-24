package hello.user_crud.domain.auth.dto.request;

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

    @Size(min = 3, max = 16)
    @NotBlank
    private String username;

    @Size(min = 8, max = 20)
    @NotBlank
    private String password;

    @Size(min = 8, max = 30)
    @NotBlank
    private String email;

    @Size(min = 5, max = 30)
    @NotBlank
    private String phone;

    @Size(min = 10, max = 10)
    @NotBlank
    private String birth;
}
