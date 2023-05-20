package repository.task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.task.Task;


@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
