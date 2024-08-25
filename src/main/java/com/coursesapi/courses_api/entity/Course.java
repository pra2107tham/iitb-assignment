package com.coursesapi.courses_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {

    @Id
    @Column(name = "courseCode")
    private Long courseCode;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

}
