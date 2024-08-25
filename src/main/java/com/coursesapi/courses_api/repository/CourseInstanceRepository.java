package com.coursesapi.courses_api.repository;

import com.coursesapi.courses_api.entity.CourseInstance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseInstanceRepository extends JpaRepository<CourseInstance, Long> {
    List<CourseInstance> findByYear(int year);

    List<CourseInstance> findAllByYear(int year);

    List<CourseInstance> findAllBySemester(int semester);

    List<CourseInstance> findAllByYearAndSemester(int year, int semester);

    CourseInstance findAllByYearAndSemesterAndId(int year, int semester, Long id);
}