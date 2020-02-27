package ru.study.math.core.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.study.math.core.entity.SubjectLessonId;
import ru.study.math.core.entity.Task;
import ru.study.math.core.entity.Test;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LessonDto {

    private SubjectLessonIdDto id;

    private UUID testId;

    private String name;

    private List<TaskDto> tasks;

}
