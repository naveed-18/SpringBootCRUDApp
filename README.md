# User Management REST API

A simple and clean **Spring Boot REST API** that performs CRUD (Create, Read, Update, Delete) operations on User data.

This project was built to understand how modern backend applications are structured using REST principles and Spring Boot automation.

## 🚀 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- REST APIs
- MySQL / H2 Database
- Postman (API testing)


## 📂 Project Architecture

The application follows a layered architecture:

Controller → Service → Repository → Entity → Database

Each layer has a single responsibility:
- **Controller**: Handles HTTP requests & responses
- **Service**: Business logic
- **Repository**: Database operations
- **Entity**: Database table mapping

## 🔑 Features

- Create a new user
- Get all users
- Get user by ID
- Update user by ID
- Delete user by ID
- Proper HTTP status codes using `ResponseEntity`
- JSON ↔ Java object mapping

## 📌 API Endpoints

### Create User
POST /users

### Get All Users
GET /users

### Get User by ID
GET /users/{id}

### Update User
PUT /users/{id}

### Delete User
DELETE /users/{id}


## 🧪 API Testing

All APIs were tested using **Postman**.

- Correct HTTP status codes (200, 201, 204, 404)
- JSON request and response handling
- Proper error handling for invalid IDs

## 🧠 Key Learnings

- RESTful API design
- Importance of HTTP status codes
- `@RestController`, `@RequestBody`, `@PathVariable`
- Primary key based updates in JPA
- Difference between POST and PUT
- Clean separation of concerns
- Spring Boot auto-configuration

## ▶️ How to Run the Project

1. Clone the repository
2. Open the project in an IDE (IntelliJ / VS Code / Eclipse)
3. Configure database in `application.properties`
4. Run the Spring Boot application
5. Test APIs using Postman

## 📌 Future Improvements

- Add validation (`@Valid`)
- Global exception handling
- DTOs instead of entities
- Pagination and sorting
- Swagger / OpenAPI documentation
- Authentication (JWT)

## ✨ Author

Built as part of learning modern backend development with Spring Boot.
