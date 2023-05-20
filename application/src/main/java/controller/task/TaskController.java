package controller.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import data.dto.task.TaskCreationDto;
import data.dto.task.TaskDto;
import ports.api.task.TaskServicePort;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskServicePort taskServicePort;

    @PostMapping("/add")
    public TaskDto addTask(@RequestBody TaskCreationDto taskCreationDto) {
        return taskServicePort.add(taskCreationDto);
    }

    @PutMapping("/update")
    public TaskDto updateTask(@RequestBody TaskCreationDto taskCreationDto) {
        return taskServicePort.update(taskCreationDto);
    }

    @GetMapping("/get/{id}")
    public TaskDto getTaskById(@PathVariable long id) {
        return taskServicePort.getById(id);
    }

    @GetMapping("/get")
    public List<TaskDto> getAllTasks() {
        return taskServicePort.getList();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTaskById(@PathVariable long id) {
        taskServicePort.deleteById(id);
    }

}
