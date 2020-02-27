package ru.study.math.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "test_t")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Test {

    private UUID id;

    @OneToMany(mappedBy = "lesson", fetch = FetchType.LAZY)
    private List<Lesson> lessons;
}
