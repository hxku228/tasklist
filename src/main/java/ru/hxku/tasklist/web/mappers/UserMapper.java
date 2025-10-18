package ru.hxku.tasklist.web.mappers;

import org.mapstruct.Mapper;
import ru.hxku.tasklist.domain.user.User;
import ru.hxku.tasklist.web.dto.user.UserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);
    User toEntity(UserDto dto);

}
