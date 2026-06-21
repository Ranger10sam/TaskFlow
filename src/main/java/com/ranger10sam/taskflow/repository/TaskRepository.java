package com.ranger10sam.taskflow.repository;

import com.ranger10sam.taskflow.enums.Priority;
import com.ranger10sam.taskflow.enums.TaskStatus;
import com.ranger10sam.taskflow.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByUserId(Long userId);
    List<Task> findByUserIdAndStatus(Long userId, TaskStatus status);
    List<Task> findByUserIdAndPriority(Long userId, Priority priority);
    List<Task> findByUserIdAndCategoryId(Long userId, Long categoryId);
    long countByUserIdAndStatus(Long userId, TaskStatus status);

}
