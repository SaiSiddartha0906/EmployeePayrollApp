# EmployeePayrollApp

A Spring Boot-based backend application for managing employee payroll information. This application serves as the backend API that can be integrated with a frontend UI for CRUD operations on employee data.

## Features

- RESTful API for Employee Payroll operations
- Spring Boot with Spring Web and Spring Data JPA
- In-memory H2 database for testing and development
- Lombok for reducing boilerplate code
- DTO and Model separation with a service layer
- Validation of input data using annotations

## Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- Maven

## Getting Started

### Prerequisites

- Java 21 or later
- Maven
- IDE like IntelliJ or Eclipse

### Clone the Repository


git clone https://github.com/SaiSiddartha0906/EmployeePayrollApp.git
cd EmployeePayrollApp

### Run the Application

./mvnw spring-boot:run

The application will start on:
`http://localhost:8080`

### API Endpoints

| Method | Endpoint       | Description           |
| ------ | -------------- | --------------------- |
| GET    | /employee      | Get all employees     |
| GET    | /employee/{id} | Get employee by ID    |
| POST   | /employee      | Add new employee      |
| PUT    | /employee/{id} | Update employee by ID |
| DELETE | /employee/{id} | Delete employee by ID |

## H2 Console

Access the in-memory H2 database at:
`http://localhost:8080/h2-console`

* JDBC URL: `jdbc:h2:mem:testdb`
* Username: `sa`
* Password: (leave empty)

## Project Structure

```
src/
├── main/
│   ├── java/com/employee/payroll/
│   │   ├── controller
│   │   ├── dto
│   │   ├── model
│   │   ├── repository
│   │   └── service
│   └── resources/
│       ├── application.properties
│       └── data.sql (if present)
```

## Contributing

Contributions are welcome! Fork the repo, create a new branch, make your changes, and submit a pull request.
