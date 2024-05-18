# Photogram 📸

Welcome to Photogram, your go-to platform for sharing photos with a unique twist! Imagine Instagram meets Amazon, where users can share their photos and tag products, incorporating affiliate referral links to Amazon, Flipkart, or in-house products they can sell. 

## Overview 🌟

Photogram is a microservices-based project designed to provide a seamless experience for users to share photos and monetize their content through affiliate marketing. At its core, Photogram consists of several microservices:

### Microservices:
- **User Management Service**: Handles user registration, authentication, and profile management.
- **Password Reset Service**: Allows users to securely reset their passwords.
- **Email Verification Service**: Ensures email addresses are verified for account security.
- **Post Service**: Manages the creation, editing, and deletion of user posts.
- **Feed Service**: Generates personalized feeds for users based on their preferences and activity.

---
🔨 **Work in Progress:** The microservices for Photogram are still under development!
---

### Infrastructure Components:
- **Spring Authorization Server**: Provides secure OAuth 2.0 authorization for the microservices.
- **Spring Discovery Service (Eureka Server)**: Enables service discovery and registration within the microservices architecture.
- **Spring Cloud Gateway**: Acts as an API gateway, routing requests to the appropriate microservices and handling cross-cutting concerns such as authentication and rate limiting.

## Getting Started 🚀

To get started with Photogram, follow these steps:

1. Clone this repository to your local machine.
2. Ensure you have Java Development Kit (JDK) 11 or higher installed.
3. Navigate to each microservice directory and follow the instructions in their respective README files to set up and run each service.
4. Once all services are running, you can access Photogram through the gateway URL provided by Spring Cloud Gateway.

## Contributing 🤝

We welcome contributions from the community to improve Photogram! Whether it's fixing bugs, adding new features, or suggesting enhancements, your input is valuable. Please refer to our [Contribution Guidelines](CONTRIBUTING.md) for more information on how to contribute.

## License 📝

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact Us 📧

If you have any questions, feedback, or suggestions, feel free to reach out to us at [email@example.com](mailto:email@example.com).

Happy sharing and monetizing your moments with Photogram! 🎉

