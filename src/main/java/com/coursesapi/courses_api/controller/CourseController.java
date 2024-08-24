package com.coursesapi.courses_api.controller;

import com.coursesapi.courses_api.entity.Course;
import com.coursesapi.courses_api.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }

}
