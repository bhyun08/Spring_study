package hello.library_crud.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OneReadResponse {
    private Long id;
    private String title;
    private String author;
}
