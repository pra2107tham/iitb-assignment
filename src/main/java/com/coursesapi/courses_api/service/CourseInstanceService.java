package com.coursesapi.courses_api.service;

import com.coursesapi.courses_api.entity.CourseInstance;
import com.coursesapi.courses_api.repository.CourseInstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseInstanceService {
    @Autowired
    private CourseInstanceRepository courseInstanceRepository;

    public List<CourseInstance> getAllCourseInstances() {
        return courseInstanceRepository.findAll();
    }

    public CourseInstance saveCourseInstance(CourseInstance courseInstance) {
        return courseInstanceRepository.save(courseInstance);
    }
}
