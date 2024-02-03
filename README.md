# SunBaseApiClient

SunBaseApiClient
SunBaseApiClient is a simple Spring Boot application that provides CRUD functionality for managing customer records. It includes features like adding, updating, and deleting customer information.

Table of Contents
Prerequisites
Installation
Usage
Endpoints
Folder Structure
Contributing
License
Prerequisites
Before you begin, ensure you have met the following requirements:

Java JDK 11 or higher
Maven
Spring Boot
Database (configured in application.properties)
Installation
Clone the repository:

Bash:
Copy code
git clone https://github.com/Rahulkumarpvt/SunBaseApiClient.git
Navigate to the project directory:

bash
Copy code
cd SunBaseApiClient
Build the project:

bash
Copy code
mvn clean install
Run the application:

bash
Copy code
mvn spring-boot:run
The application will be accessible at http://localhost:8080.

Usage
The application provides a simple web interface for managing customer records. You can access it through your browser at http://localhost:8081.

Endpoints
GET /customerList: View the list of customers.
GET /addCustomer: Add or update customer information.
POST /addCustomer: Submit the customer details form.
GET /deleteCustomer?id={customerId}: Delete a customer by ID.
Folder Structure
The project follows a standard Spring Boot application structure:

css
Copy code
SunBaseApiClient/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── rahul/
│   │   │               └── SunBaseApiClient/
│   │   │                   ├── controller/
│   │   │                   ├── entity/
│   │   │                   ├── repository/
│   │   │                   └── service/
│   │   ├── resources/
│   │   │   ├── static/
│   │   │   └── templates/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── target/
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
Contributing
Contributions are welcome! Please follow the CONTRIBUTING.md guidelines.
