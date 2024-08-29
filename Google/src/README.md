# Recommendation System

## Overview
This project implements a recommendation system with various algorithms, APIs, and user feedback mechanisms.

## Setup
1. Install dependencies: `mvn install`
2. Set up the database: `mysql -u root -p < scripts/setup-database.sql`
3. Populate the database: `mysql -u root -p < scripts/populate-data.sql`
4. Run the application: `mvn spring-boot:run`

## Running Tests
Execute tests with: `scripts/run-tests.sh`

## Docker
Build and run the application with Docker:
```bash
docker-compose up --build
