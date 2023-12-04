# Assignment-5-Boot-Web-5-Assignments-included

### Installation
1. Clone the repository:
 with git clone commmand
2. Navigate to the project directory:cd your-project
3.Build the project:mvn clean install   # For Maven # or
gradlew clean build # For Gradle

Access the application at http://localhost:8080.

## Project Structure
 src/main/java: Java source files.
 src/main/resources: Configuration files and static resources.
 src/test: Test source files.target: Compiled bytecode and build artifacts.

## Endpoints
* Login/Validate User
POST /api/login
* Search Flights
GET /api/flights - Get all flights
GET /api/flights/search - Search flights by criteria
* Booking
POST /api/flights/book - Book a flight
*Check-inPOST /api/checkin
