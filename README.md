# Student CRUD API

A simple RESTful API built with **Spring Boot** and **PostgreSQL** that manages student information (name, tech stack, etc.).

## 🚀 Features
- Add new students
- Get all students
- Update existing students
- Delete students by ID

## 🧩 API Endpoints

| Method | Endpoint | Description |
|---------|-----------|-------------|
| `POST` | `/api/v1/students` | Add a new student |
| `GET` | `/api/v1/students` | Get all students |
| `PUT` | `/api/v1/students/{id}` | Update student by ID |
| `DELETE` | `/api/v1/students/{id}` | Delete student by ID |

## 🛠️ Technologies Used
- Spring Boot
- PostgreSQL
- Docker (for database container)
- IntelliJ IDEA

##  Example JSON
`json
{
  "name": "Alex",
  "tech_stack": "Laravel, Express, Ruby"
}```

## How to run
git clone https://github.com/dagimawit-belayineh/springboot-api.git
Start PostgresSQL (or use Docker)
Run the Spring Boot application in IntelliJ or  with
mvn spring-boot:run
Built by Dagimawit Belayineh


