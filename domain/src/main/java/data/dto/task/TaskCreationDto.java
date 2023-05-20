package data.dto.task;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TaskCreationDto {

    private String title;
    private String description;
    private LocalDate estimatedIssueTime;
    private boolean finished;
    private Long userId;

}
