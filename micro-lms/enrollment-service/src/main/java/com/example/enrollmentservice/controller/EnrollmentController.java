package com.example.enrollmentservice.controller;

import com.example.enrollmentservice.event.EnrollmentEventPublisher;
import com.example.enrollmentservice.model.Enrollment;
import com.example.enrollmentservice.repository.EnrollmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

  private final EnrollmentRepository repo;
  private final EnrollmentEventPublisher publisher;

  public EnrollmentController(EnrollmentRepository repo, EnrollmentEventPublisher publisher) {
    this.repo = repo;
    this.publisher = publisher;
  }

  @GetMapping
  public List<Enrollment> getAll() {
    return repo.findAll();
  }

  @PostMapping
  public Enrollment create(@RequestBody Enrollment enrollment) {
    Enrollment saved = repo.save(enrollment);
    publisher.sendEnrollmentEvent(saved.getUserId(), saved.getCourseId());
    return saved;
  }
}