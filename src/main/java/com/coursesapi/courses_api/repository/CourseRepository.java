package com.coursesapi.courses_api.repository;

import com.coursesapi.courses_api.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
