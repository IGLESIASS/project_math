package dto;

import dto.type.SubjectType;
import dto.type.TaskType;

import java.util.UUID;

public class TaskDto {

    private UUID id;
    private SubjectType subject;
    private TaskType taskType;

    public TaskDto() {

    }

}