package ru.hxku.tasklist.web.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import ru.hxku.tasklist.web.dto.validation.OnCreate;
import ru.hxku.tasklist.web.dto.validation.OnUpdate;


@Data
@Schema(description = "UserDto")
public class UserDto {

    @NotNull(message = "Id must be not null", groups = OnUpdate.class)
    @Schema(description = "User id", example = "1")
    private Long id;

    @NotNull(message = "Name must be not null", groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 255, message = "Name must be smaller than 255 symbols", groups = {OnUpdate.class, OnCreate.class})
    @Schema(description = "user name", example = "marik frontend")
    private String name;

    @NotNull(message = "Username must be not null", groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 255, message = "Username must be smaller than 255 symbols", groups = {OnUpdate.class, OnCreate.class})
    @Schema(description = "user username", example = "marik@frontend.ru")
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password must be not null", groups = {OnUpdate.class, OnCreate.class})
    @Schema(description = "User password", example = "$2a$12$Jx2tPiLme2UWVx3TdK4WWeNRyht0AwWlJsmO9Cm0b2f.93JI7Qnki")
    private String password;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password confirmation must be not null", groups = {OnCreate.class})
    @Schema(description = "User password confirmation", example = "$2a$12$Jx2tPiLme2UWVx3TdK4WWeNRyht0AwWlJsmO9Cm0b2f.93JI7Qnki")
    private String passwordConfirmation;

}
