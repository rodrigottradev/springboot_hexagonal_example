package ports.spi.task;

import java.util.List;

import data.dto.task.TaskCreationDto;
import data.dto.task.TaskDto;

public interface TaskPersistencePort {

    TaskDto add(TaskCreationDto creationDto);

    void deleteById(Long id);

    TaskDto update(TaskCreationDto creationDto);

    List<TaskDto> getList();

    TaskDto getById(Long id);
}
