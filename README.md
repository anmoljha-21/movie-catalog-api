# Movie Catalog API

This is a simple Spring Boot REST API built for managing a collection of movies.  
It uses in-memory storage (`ArrayList`) and supports adding a movie and fetching a movie by ID.

---

## How to Run

Make sure Java 21 and Maven are installed.

Run the application:

```bash
mvn spring-boot:run
The server will start on:

http://localhost:8080
API Endpoints
1) Add a Movie
POST

/api/movies
Example JSON request body:

{
  "name": "Inception",
  "description": "A mind-bending sci-fi movie",
  "genre": "Sci-Fi",
  "rating": 9.0
}
Response:

201 Created

Returns the created movie with an auto-generated id

2) Get Movie by ID
GET

/api/movies/{id}
Example:

/api/movies/1
Response:

200 OK if the movie exists

404 Not Found if the movie does not exist

Validation Rules
name must not be blank

description must not be blank (min 5, max 500 characters)

genre must not be blank

rating must be between 0 and 10

Invalid input returns 400 Bad Request.

Notes
Movies are stored in memory, so data resets when the application restarts.

IDs are generated automatically using an internal counter.

**Deployed URL:** `https://movie-catalog-api-v3yt.onrender.com/`

Author
Anmol Jha
