package hello.user_crud.domain.auth.dto.response;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class CheckResponse {

    private String username;

    private String email;

    private String phone;

    private String birth;
}
