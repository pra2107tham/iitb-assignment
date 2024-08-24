package com.coursesapi.courses_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CourseInstance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int year;
    private int semester;
    private String courseId;
}
