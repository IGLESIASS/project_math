package ru.study.math.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class SubjectLessonId implements Serializable {

    private UUID subjectId;

    private UUID lessonId;
}
