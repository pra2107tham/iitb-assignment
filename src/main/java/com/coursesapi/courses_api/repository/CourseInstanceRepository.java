package com.coursesapi.courses_api.repository;

import com.coursesapi.courses_api.entity.CourseInstance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseInstanceRepository extends JpaRepository<CourseInstance, Long> {

}
