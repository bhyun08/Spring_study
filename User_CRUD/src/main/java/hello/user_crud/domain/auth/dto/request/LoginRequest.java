package hello.user_crud.domain.auth.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoginRequest {
    @Size(min = 3, max = 16)
    @NotBlank
    private String username;

    @Size(min = 8, max = 20)
    @NotBlank
    private String password;
}
