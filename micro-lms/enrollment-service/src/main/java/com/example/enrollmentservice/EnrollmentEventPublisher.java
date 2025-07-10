package com.example.enrollmentservice.event;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class EnrollmentEventPublisher {

  private final RabbitTemplate rabbitTemplate;

  public EnrollmentEventPublisher(RabbitTemplate rabbitTemplate) {
    this.rabbitTemplate = rabbitTemplate;
  }

  public void sendEnrollmentEvent(Long userId, Long courseId) {
    String message = "User " + userId + " enrolled in course " + courseId;
    rabbitTemplate.convertAndSend("enrollmentQueue", message);
  }
}