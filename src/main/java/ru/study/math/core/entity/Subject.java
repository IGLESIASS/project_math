package ru.study.math.core.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.study.math.core.entity.type.SubjectType;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "subject_t")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {

    @Id
    @GeneratedValue
    private UUID id;

    @Enumerated(EnumType.STRING)
    private SubjectType name;

}
