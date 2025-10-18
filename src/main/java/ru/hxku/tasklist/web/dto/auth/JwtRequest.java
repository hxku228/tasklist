package ru.hxku.tasklist.web.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "Request for login")
public class JwtRequest {

    @NotNull(message = "Username must be not null")
    @Schema(description = "username" , example = "marikfrontend@gmail.com")
    private String username;

    @NotNull(message = "Password must be not null")
    @Schema(description = "password" , example = "12345")
    private String password;

}
