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

    public CourseInstanceService(CourseInstanceRepository courseInstanceRepository) {
        this.courseInstanceRepository = courseInstanceRepository;
    }

    public CourseInstance addCourseInstance(CourseInstance courseInstance) {
        return courseInstanceRepository.save(courseInstance);
    }
    public List<CourseInstance> getCourseInstances() {
        return courseInstanceRepository.findAll();
    }
    public List<CourseInstance> getCourseInstancesByYear(int year){
        return courseInstanceRepository.findAllByYear(year);
    }
    public List<CourseInstance> getCourseInstancesBySemester(int semester){
        return courseInstanceRepository.findAllBySemester(semester);
    }
    public List<CourseInstance> getCourseInstancesByYearAndSemester(int year, int semester){
        return courseInstanceRepository.findAllByYearAndSemester(year, semester);
    }
    public CourseInstance getCourseInstanceByYearAndSemesterAndId(int year, int semester, Long id){
        return courseInstanceRepository.findAllByYearAndSemesterAndId(year, semester, id);
    }
    public String deleteCourseInstanceByYearSemesterAndId(int year, int semester, Long id) {
        CourseInstance courseInstance = courseInstanceRepository.findAllByYearAndSemesterAndId(year, semester, id);
        if (courseInstance != null) {
            courseInstanceRepository.delete(courseInstance);
            return "CourseInstance deleted successfully";
        } else {
            return "CourseInstance not found";
        }
    }

}
