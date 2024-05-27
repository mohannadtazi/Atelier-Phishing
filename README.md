# Facebook Clone: Phishing Illustration Project

## Overview

This project is a demonstration of how phishing attacks can be executed using a fake Facebook login page. It is developed using Java Enterprise Edition (JEE) for backend functionality and utilizes Azure Web App for deployment. MongoDB Atlas is used for database management, storing login credentials, and other user data.

## Features

- Fake Login Page: Mimics the appearance and behavior of the Facebook login page to deceive users.
- Credential Storage: Stores usernames, passwords, and other user data entered on the fake login page.
- Session Hijacking: Demonstrates how attackers can gain unauthorized access to user accounts using stolen credentials.
- Data Extraction: Provides an interface to view and extract stored credentials for demonstration purposes.

## Technologies Used

- **Java EE (JEE)**: Used for backend development to handle HTTP requests and responses.
- **Azure Web App**: Deployed on Azure for accessibility and scalability.
- **MongoDB Atlas**: Managed database service used for storing user credentials and other sensitive information.
- **HTML/CSS/JavaScript**: Frontend technologies for creating a convincing fake Facebook login page.
- **Apache Maven**: Dependency management tool used for building and managing the project.

## Deployment

The application was deployed using GitHub Actions for continuous integration and deployment. Follow these steps to deploy the application:

1. Clone the repository to your local machine.
2. Make any necessary modifications or configurations.
3. Push your changes to the GitHub repository.
4. GitHub Actions will automatically build and deploy the project to Azure Web App based on the workflow configuration.
5. Once deployed, the application will be accessible via the provided URL.

### GitHub Actions Workflow

The GitHub Actions workflow is configured to trigger on each push to the main branch. It performs the following steps:

- Builds the project using Maven.
- Deploys the WAR file to Azure Web App.

For detailed configuration, refer to the `.github/workflows` directory in the repository.

## Project URL

You can access the deployed project at the following URL:

[Facebook Clone - Phishing Illustration](https://data-security-atelier.azurewebsites.net/Facebook_clone-1.0-SNAPSHOT/)

## Database Configuration

The application uses MongoDB Atlas as its database. Follow these steps to configure the database:

1. Create a MongoDB Atlas account and set up a new cluster.
2. Obtain the connection string for your MongoDB Atlas cluster.
3. Configure the connection string in the application properties or environment variables.
4. Ensure the firewall settings allow connections from your application server.

## Usage

1. Access the application through the provided URL.
2. Users will be presented with a fake Facebook login page.
3. Enter dummy credentials to log in (for demonstration purposes only).
4. Once logged in, the credentials will be stored in the database.
5. Use the provided interface to view and extract stored credentials.

## Disclaimer

This project is for educational and illustrative purposes only. The use of fake login pages and the storage of user credentials without consent is illegal and unethical. It is essential to use this project responsibly and ethically, respecting user privacy and security at all times.

## Contributors

- [Mohannad TAZI](https://www.linkedin.com/in/mohannad-tazi/)

