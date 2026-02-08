🎬 Movie Catalog API (Spring Boot)

A simple Java Spring Boot backend application that implements a RESTful API for managing a collection of movies.

This project was built as a sample task to demonstrate REST API development using:

Spring Boot

In-memory data storage (ArrayList)

Input validation

Exception handling

✅ Features

Add a new movie

Get a movie by ID

Input validation using Jakarta Validation

Proper HTTP status codes (201, 200, 404)

In-memory storage using ArrayList

🛠 Tech Stack

Java 21

Spring Boot 3+

Maven

Lombok

Spring Web

Validation (Jakarta)

▶ How to Run the Project Locally
1) Clone the repository
git clone <YOUR_GITHUB_REPO_LINK>
cd movie-catalog-api

2) Run the application
mvn spring-boot:run

3) App runs on:
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

If an invalid movie id is requested:

Example:

GET /api/movies/999


Response:

404 Not Found

Movie not found with id: 999

✅ Input Validation

Validation rules:

name → required (not blank)

description → required, 5 to 500 characters

genre → required

rating → must be between 0 and 10

Invalid requests return:

400 Bad Request

🌍 Deployment

This Spring Boot application can be deployed on platforms like:

Render (recommended)

Railway

Fly.io

After deployment, your base URL will look like:

https://<your-app-name>.onrender.com

👤 Author

Anmol Jha
Freelance Java Developer