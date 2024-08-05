package hello.jwt_practice.global.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ExceptionResponse {
    public int status;
    public String message;
}
