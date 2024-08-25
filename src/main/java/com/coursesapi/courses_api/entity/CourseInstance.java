package com.coursesapi.courses_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CourseInstance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "delivery_year")
    private int year;

    private int semester;

    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "courseCode")
    private Course course;
}
