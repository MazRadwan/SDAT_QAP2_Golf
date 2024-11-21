# Golf Club Management API

A Spring Boot REST API for managing golf club memberships and tournaments.

## Search APIs

### Member Search Endpoints
- Search by name: `GET /api/members/search/name/{name}`
- Search by phone: `GET /api/members/search/phone/{phone}`
- Search by start date: `GET /api/members/search/startDate?startDate=YYYY-MM-DD`
- Search by duration: `GET /api/members/search/duration/{duration}`

### Tournament Search Endpoints
- Search by location: `GET /api/tournaments/search/location/{location}`
- Search by date: `GET /api/tournaments/search/date?startDate=YYYY-MM-DD`
- Search by date range: `GET /api/tournaments/search/dateRange?start=YYYY-MM-DD&end=YYYY-MM-DD`
- Find tournament members: `GET /api/tournaments/{tournamentId}`

## Running with Docker

1. Clone the repository
2. Build the project: `./mvnw package`
3. Run: `docker-compose up --build`

The application will be available at:
- API: `http://localhost:8080`
- MySQL Database: `localhost:3306`

## Database Configuration
MySQL database will be automatically configured with:
- Database name: golf_club_db
- Username: root
- Password: [Your configured password]