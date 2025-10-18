package ru.hxku.tasklist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.hxku.tasklist.domain.task.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    @Query(value = """
            select * from tasks t 
            join users_tasks ut on ut.task_id = t.id
            where ut.user_id = :userId
            """, nativeQuery = true)
    List<Task> findByUserId(@Param("userId") Long userId);


}
