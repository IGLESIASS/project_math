package ru.study.math.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.study.math.core.entity.type.TaskDifficultyType;
import ru.study.math.core.entity.type.TaskType;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "task_t")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name="lesson_id")
    private Lesson lesson;

    @Enumerated(EnumType.STRING)
    private TaskType type;

    @Enumerated(EnumType.STRING)
    private TaskDifficultyType difficulty;



}
