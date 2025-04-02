Server-Side Validation with Spring Boot & JavaScript



1. Overview =>

This project demonstrates how to implement server-side validation in a Spring Boot application and integrate it with a frontend form using JavaScript. The API receives user input, validates it on the server, and returns appropriate error messages or a success response.

Why Server-Side Validation?

While client-side validation (JavaScript) helps improve user experience by providing instant feedback, it can be bypassed easily using browser developer tools. Server-side validation ensures:

Security: Prevents malicious users from injecting invalid data.

Data Integrity: Ensures only correctly formatted data is processed.

Consistency: Even if client-side validation is disabled, the server enforces validation rules.



2. Features =>

Spring Boot REST API for handling form submissions.

Jakarta Validation annotations for enforcing field constraints.

BindingResult to capture validation errors and return structured responses.

JavaScript Fetch API to submit data and display validation messages dynamically.

Error handling for form validation and exceptions.



3. Technologies Used =>

Backend: Spring Boot, Java, Jakarta Validation (Hibernate Validator)

Frontend: JavaScript (Fetch API), HTML, CSS

Database: None (validation only)



4. API Endpoints =>

POST /lgform/login

Request Body (JSON):

{
  "username": "JohnDoe",
  "email": "johndoe@example.com",
  "isChecked": true
}

Response (Validation Errors):

{
  "usernameError": "Username must be between 3 to 9 characters",
  "emailError": "Enter a valid email",
  "checkError": "You must agree to terms"
}

Response (Success):

"Login successful"



Now that validation is in place, the next step is implementing authentication (JWT, OAuth) for secure login in the Amazon Clone project.

