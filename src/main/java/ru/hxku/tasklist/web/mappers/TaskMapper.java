package ru.hxku.tasklist.web.mappers;

import org.mapstruct.Mapper;
import ru.hxku.tasklist.domain.task.Task;
import ru.hxku.tasklist.web.dto.task.TaskDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toDto(Task task);
    List<TaskDto> toDto(List<Task> tasks);
    Task toEntity(TaskDto dto);

}
