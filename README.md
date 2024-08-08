## Demo Project: Spring Boot WebFlux and Kafka
#### Description
This demo project illustrates the integration of Spring Boot with WebFlux to create reactive applications and the use of Kafka for real-time message processing. The goal is to provide a practical example of how these technologies can be combined to build scalable and high-performance systems.
#### Features
- Spring Boot WebFlux: Implementation of reactive services using a non-blocking paradigm for improved scalability.
- Apache Kafka: Management of asynchronous communication between different components of the application via Kafka topics.
- API Examples: Endpoints to demonstrate sending and receiving messages via Kafka.
#### Prerequisites
- Java 17 or later
- Apache Kafka (installed and running)
- Maven (for dependency management)
#### Installation
- 1. Clone the repository: https://github.com/abdoulkarim20/Spring-WebFlux-Apache-Kafka
- 2. Navigate to the project directory: cd Spring-WebFlux-Apache-Kafka/productmanagement
- 3. Build and run the project: mvn spring-boot:run
- 4. Ensure Kafka is running: You can download and start Kafka from kafka.apache.org.
#### Note: For a better demonstration :
For a better demonstration, please follow the instructions in the official documentation to install Apache Kafka on your machine. This guide will help you configure Kafka and start a local broker. You can find the guide at https://kafka.apache.org/quickstart.
#### Configuration
- Rename the configuration file: In the src/main/resources directory, rename the file exemple.properties to application.properties.
- Modify the settings as needed: Open application.properties and adjust the configurations according to your environment, including Kafka settings and other properties specific to your application.
