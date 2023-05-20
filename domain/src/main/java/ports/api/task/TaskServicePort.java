package ports.api.task;

import java.util.List;

import data.dto.task.TaskCreationDto;
import data.dto.task.TaskDto;

public interface TaskServicePort {

    TaskDto add(TaskCreationDto creationDto);

    void deleteById(Long id);

    TaskDto update(TaskCreationDto creationDto);

    List<TaskDto> getList();

    TaskDto getById(Long id);
}

