package mapper.task;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import data.dto.task.TaskCreationDto;
import data.dto.task.TaskDto;
import entity.task.Task;

@Mapper
public interface TaskMapper {

    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);

    TaskDto taskToTaskDto(Task task);

    Task taskCreationDtoToTask(TaskCreationDto taskCreationDto);

    List<TaskDto> taskListToTaskDtoList(List<Task> taskList);

}
