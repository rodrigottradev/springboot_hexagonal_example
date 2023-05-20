package services.task;

import java.util.List;

import data.dto.task.TaskCreationDto;
import data.dto.task.TaskDto;
import lombok.RequiredArgsConstructor;
import ports.api.task.TaskServicePort;
import ports.spi.task.TaskPersistencePort;

@RequiredArgsConstructor
public class TaskServiceImpl implements TaskServicePort {

    private final TaskPersistencePort taskPersistencePort;

    @Override
    public TaskDto add(final TaskCreationDto creationDto) {
        return taskPersistencePort.add(creationDto);
    }

    @Override
    public void deleteById(final Long id) {
        taskPersistencePort.deleteById(id);
    }

    @Override
    public TaskDto update(final TaskCreationDto creationDto) {
        return taskPersistencePort.update(creationDto);
    }

    @Override
    public List<TaskDto> getList() {
        return taskPersistencePort.getList();
    }

    @Override
    public TaskDto getById(final Long id) {
        return taskPersistencePort.getById(id);
    }
}
