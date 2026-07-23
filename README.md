# Student Management System

A Spring Boot application for managing student information.

## Technology Stack

- Java 17
- Spring Boot 4.0.6
- Spring Data JPA
- H2 Database
- Lombok

## Project Structure

```
src/main/java/com/example/demo/
├── StudentdemoApplication.java    # Application entry point
├── Controller/                    # REST API controllers
├── service/                       # Service interfaces
├── serviceImpl/                   # Service implementations
├── repository/                    # Data access layer
├── entity/                        # JPA entities
└── dto/                           # Data transfer objects
```

## Features

- Add new students
- Update existing students
- Delete students
- Get student by ID
- Get all students

## Getting Started

### Prerequisites

- JDK 17 or higher
- Maven

### Running the Application

```bash
cd studentspringboot
mvn spring-boot:run
```

### Access H2 Console

After starting the application, visit:
```
http://localhost:8080/h2-console
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /students | Add a new student |
| PUT | /students/{id} | Update an existing student |
| DELETE | /students/{id} | Delete a student |
| GET | /students/{id} | Get student by ID |
| GET | /students | Get all students |

