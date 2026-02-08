Movie Catalog API (Spring Boot)

A simple Java Spring Boot backend application that implements a RESTful API for managing a collection of movies.
This project demonstrates:
REST API development
In-memory storage using ArrayList
Input validation
Proper exception handling (404)

✅ Features
Add a new movie
Get a movie by ID
Input validation using Jakarta Validation
Proper HTTP status codes (201, 200, 400, 404)
In-memory data store (ArrayList)

🛠 Tech Stack

Java 21
Spring Boot 3+
Maven
Spring Web
Validation (Jakarta)
Lombok

▶ How to Run Locally
1) Clone the repository
git clone https://github.com/anmoljha-21/movie-catalog-api.git
cd movie-catalog-api

2) Run the application
mvn spring-boot:run

3) Application runs on:
http://localhost:8080

📌 API Endpoints
✅ 1) Add Movie

POST
/api/movies

Request Body (JSON)
{
  "name": "Inception",
  "description": "A mind-bending sci-fi movie",
  "genre": "Sci-Fi",
  "rating": 9.0
}

Response
201 Created

{
  "id": 1,
  "name": "Inception",
  "description": "A mind-bending sci-fi movie",
  "genre": "Sci-Fi",
  "rating": 9.0
}

✅ 2) Get Movie by ID

GET

/api/movies/{id}
Example:

/api/movies/1
Response
200 OK

{
  "id": 1,
  "name": "Inception",
  "description": "A mind-bending sci-fi movie",
  "genre": "Sci-Fi",
  "rating": 9.0
}

❌ Movie Not Found (404)

If a movie ID does not exist:
Example:
GET /api/movies/999

Response:
404 Not Found
Movie not found with id: 999

✅ Input Validation Rules

name → required (not blank)
description → required, 5 to 500 characters
genre → required (not blank)
rating → must be between 0 and 10

Invalid requests return:
400 Bad Request

🌍 Deployment

This project is deployed on:Render
Once deployed, the API can be tested using Postman/curl.

👤 Author
Anmol Jha
Freelance Java Developer
