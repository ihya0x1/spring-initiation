# Spring TP1 – Framework Configuration

This repository contains the code for **TP1: Initiation à la configuration du framework Spring**, developed as part of coursework at INSEA.  
The objective is to learn the basics of Spring Framework, particularly how to configure and manage beans using:

- **XML-based configuration**
- **Annotation-based configuration with @Component**
- **Dependency injection with @Autowired**

## 🧩 Project Structure
```text
src/
└── main/
└── java/
└── hellospring/
├── xmlconfig/ # XML-based Spring configuration
├── javaconfig/ # Java annotations (@Component, @Value)
└── autowired/ # Dependency injection using @Autowired
```
markdown
Copier
Modifier

Each package includes:
- A `HelloWorld` bean
- A Spring configuration (XML or Java class)
- A test class to demonstrate bean loading and message output

## ⚙️ Technologies

- Java 1.7+
- Maven
- Spring Framework 5.2.2.RELEASE
- Eclipse IDE

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/spring-tp1.git
   cd spring-tp1
Open the project in Eclipse as a Maven Project.

Run each test class:

TestXML.java for XML config

TestJava.java for @Component and @Value

TestAutowired.java for @Autowired injection

📚 Learning Goals
✔️ Understand how to configure Spring beans using XML and Java annotations
✔️ Use @ComponentScan, @Value, and @Autowired for flexible bean management
✔️ Practice modular and maintainable code using Spring’s IoC container

📄 License
This project is part of academic coursework and is intended for learning purposes only.
