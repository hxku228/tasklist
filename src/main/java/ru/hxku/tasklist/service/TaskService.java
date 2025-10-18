package ru.hxku.tasklist.service;

import ru.hxku.tasklist.domain.task.Task;

import java.util.List;

public interface TaskService {

    Task getById(long id);

    List<Task> getAllByUserId(Long id);

    Task update(Task task);

    Task create(Task task, Long UserId);

    void delete(Long id);

}
