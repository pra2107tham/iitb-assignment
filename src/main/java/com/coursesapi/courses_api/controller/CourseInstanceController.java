package com.coursesapi.courses_api.controller;

import com.coursesapi.courses_api.entity.Course;
import com.coursesapi.courses_api.entity.CourseInstance;
import com.coursesapi.courses_api.repository.CourseInstanceRepository;
import com.coursesapi.courses_api.service.CourseInstanceService;
import lombok.Getter;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/instances")
public class CourseInstanceController {
    @Autowired
    private CourseInstanceService courseInstanceService;

    @GetMapping
    public List<CourseInstance> getCourseInstances() {
        return courseInstanceService.getCourseInstances();
    }
    @PostMapping
    public CourseInstance addCourseInstance(@RequestBody CourseInstance courseInstance) {
        return courseInstanceService.addCourseInstance(courseInstance);
    }
    @GetMapping("/{year}")
    public List<CourseInstance> getCourseInstancesByYear(@PathVariable int year) {
        return courseInstanceService.getCourseInstancesByYear(year);
    }
//    @GetMapping("/{semester}")
//    public List<CourseInstance> getCourseInstancesBySemester(@PathVariable int semester) {
//        return courseInstanceService.getCourseInstancesBySemester(semester);
//    }
    @GetMapping("/{year}/{semester}")
    public List<CourseInstance> getCourseInstancesByYearAndSemester(@PathVariable int year, @PathVariable int semester) {
        return courseInstanceService.getCourseInstancesByYearAndSemester(year, semester);
    }
    @GetMapping("/{year}/{semester}/{id}")
    public CourseInstance getCourseInstanceByYearAndSemesterAndId(@PathVariable int year, @PathVariable int semester, @PathVariable Long id) {
        return courseInstanceService.getCourseInstanceByYearAndSemesterAndId(year, semester, id);
    }
    @DeleteMapping("/{year}/{semester}/{id}")
    public ResponseEntity<String> deleteCourseInstanceByYearSemesterAndId(@PathVariable int year, @PathVariable int semester, @PathVariable Long id) {
        try {
            String result = courseInstanceService.deleteCourseInstanceByYearSemesterAndId(year, semester, id);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid input data");
        }
    }

}
