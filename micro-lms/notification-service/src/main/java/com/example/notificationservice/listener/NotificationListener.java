package com.example.notificationservice.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationListener {

  @RabbitListener(queues = "enrollmentQueue")
  public void handleEnrollmentEvent(String message) {
    System.out.println("[NOTIFICATION] Received: " + message);
    // Burada mail/SMS gönderimi vs. simüle edilebilir.
  }
}