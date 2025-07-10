package com.example.courseservice.controller;

import com.example.courseservice.model.Course;
import com.example.courseservice.repository.CourseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

  private final CourseRepository courseRepository;

  public CourseController(CourseRepository courseRepository) {
    this.courseRepository = courseRepository;
  }

  @GetMapping
  public List<Course> getAllCourses() {
    return courseRepository.findAll();
  }

  @PostMapping
  public Course createCourse(@RequestBody Course course) {
    return courseRepository.save(course);
  }
}