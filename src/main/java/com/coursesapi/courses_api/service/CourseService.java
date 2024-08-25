package com.coursesapi.courses_api.service;

import com.coursesapi.courses_api.entity.Course;
import com.coursesapi.courses_api.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
    public Optional<Course> getCourseById(Long courseCode) {
        return courseRepository.findById(courseCode);
    }
    public Course createCourse(Course course) {
        if(course == null || course.getCourseCode() == null ) {
            throw new IllegalArgumentException("Coursecode cannot be null");
        }
        return courseRepository.save(course);
    }
    public void deleteCourse(Long courseCode) {
        if (!courseRepository.existsById(courseCode)) {
            throw new IllegalArgumentException("Course with given code does not exist");
        }
        courseRepository.deleteById(courseCode);
    }
}
