package hello.shop_crud.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserSignUpRequest {

    @Size(min = 3, max = 20)
    @NotBlank
    private String userid;

    @Size(min = 3, max = 20)
    @NotBlank
    private String username;

    @Size(min = 8, max = 26)
    @NotBlank
    private String password;

    @Size(min = 3, max = 30)
    @NotBlank
    private String email;
}
