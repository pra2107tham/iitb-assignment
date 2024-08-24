package com.coursesapi.courses_api.controller;

import com.coursesapi.courses_api.entity.Course;
import com.coursesapi.courses_api.entity.CourseInstance;
import com.coursesapi.courses_api.repository.CourseInstanceRepository;
import com.coursesapi.courses_api.service.CourseInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/instances")
public class CourseInstanceController {
    @Autowired
    private CourseInstanceService courseInstanceService;

    @GetMapping
    public List<CourseInstance> getAllCourseInstances() {
        return courseInstanceService.getAllCourseInstances();
    }

    @PostMapping
    public CourseInstance addCourseInstance(CourseInstance courseInstance){
        return courseInstanceService.saveCourseInstance(courseInstance);
    }
}
