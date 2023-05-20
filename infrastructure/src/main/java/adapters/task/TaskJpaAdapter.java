package adapters.task;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.dto.task.TaskCreationDto;
import data.dto.task.TaskDto;
import entity.task.Task;
import mapper.task.TaskMapper;
import ports.spi.task.TaskPersistencePort;
import repository.task.TaskRepository;

@Service
public class TaskJpaAdapter implements TaskPersistencePort {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public TaskDto add(TaskCreationDto taskCreationDto) {
        Task task = TaskMapper.INSTANCE.taskCreationDtoToTask(taskCreationDto);
        Task savedTask = taskRepository.save(task);
        return TaskMapper.INSTANCE.taskToTaskDto(savedTask);
    }

    @Override
    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public TaskDto update(TaskCreationDto taskCreationDto) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<TaskDto> getList() {
        List<Task> taskList = taskRepository.findAll();
        return TaskMapper.INSTANCE.taskListToTaskDtoList(taskList);
    }

    @Override
    public TaskDto getById(Long taskId) {
        Optional<Task> taskOptional = taskRepository.findById(taskId);

        if (taskOptional.isPresent()) {
            return TaskMapper.INSTANCE.taskToTaskDto(taskOptional.get());
        }
        return null;
    }
}
