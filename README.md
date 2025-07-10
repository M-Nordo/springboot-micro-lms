# Micro LMS

**Micro LMS** is a microservices-based Learning Management System built with Spring Boot and Spring Cloud.  
It demonstrates a modular architecture with discovery, config, API gateway, and multiple domain services.

**Micro LMS**, Spring Boot ve Spring Cloud ile oluşturulmuş, mikroservis tabanlı bir Öğrenme Yönetim Sistemidir.
Keşif, yapılandırma, API ağ geçidi ve birden fazla servis içeren modüler bir mimariye sahiptir.

---

## 🚀 Overview

This project contains the following microservices:

- **discovery-server**: Eureka discovery service for service registration and discovery  
- **config-server**: Spring Cloud Config Server (needs Git repository configured)  
- **api-gateway**: API Gateway using Spring Cloud Gateway  
- **user-service**: User management microservice  
- **course-service**: Course management microservice  
- **enrollment-service**: Enrollment management microservice  
- **notification-service**: Notification sending microservice  

This setup allows independent development, deployment, and scaling of each service.

## 🚀 Genel Bakış

Bu proje aşağıdaki mikro servisleri içermektedir:

- **discovery-server**: Servis kaydı ve keşfi için Eureka
- **config-server**: Spring Cloud Config Server (Git reposunun yapılandırılması gerekir)
- **api-gateway**: Spring Cloud Gateway kullanan API Gateway
- **user-service**: User yönetim mikroservisi 
- **course-service**: Course yönetim mikroservisi  
- **enrollment-service**: Enrollment yönetim mikroservisi 
- **notification-service**: Notification yönetim mikroservisi 

---

## 🛠 Prerequisites / Gereksinimler

- Java 17  
- Maven with mvnd (Maven Daemon) recommended  
- Git (for config server repository, if used)  

---

## ⚙️ How to run / Çalıştırma

1. Clone the repository / Projeyi klonla:

```bash
git clone https://github.com/M-Nordo/springboot-micro-lms.git
cd springboot-micro-lms
```
