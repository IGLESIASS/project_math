package ru.study.math.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lesson_t")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {

    @Id
    @Embedded
    private SubjectLessonId id;

    @ManyToOne
    @JoinColumn(name="test_id")
    private Test test;

    private String name;

    @OneToMany(mappedBy = "task", fetch = FetchType.LAZY)
    private List<Task> tasks;

}
