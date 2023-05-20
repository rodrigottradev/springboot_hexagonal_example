package data.dto.task;

import java.time.LocalDate;

import data.dto.user.UserDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TaskDto {

    private Long id;
    private String title;
    private String description;
    private LocalDate creationTime;
    private LocalDate estimatedIssueTime;
    private boolean finished;
    private UserDto taskUser;
}
