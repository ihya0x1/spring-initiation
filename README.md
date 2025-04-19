# Spring TP1 – Framework Configuration

This repository contains the code for **TP1: Initiation à la configuration du framework Spring**, developed as part of coursework at INSEA.  
The objective is to learn the basics of Spring Framework, particularly how to configure and manage beans using:

- **XML-based configuration**
- **Annotation-based configuration with @Component**
- **Dependency injection with @Autowired**

## 🧩 Project Structure

src/ └── main/ └── java/ └── hellospring/ ├── xmlconfig/ # XML-based Spring configuration ├── javaconfig/ # Java annotations (@Component, @Value) └── autowired/ # Dependency injection using @Autowired


Each package includes:
- A `HelloWorld` bean
- A Spring configuration (XML file or Java config class)
- A test class demonstrating the configuration

---

## ⚙️ Technologies Used

- Java 1.7+
- Maven
- Spring Framework 5.2.2.RELEASE
- Eclipse IDE

---

## 🚀 How to Run the Project

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/spring-tp1.git
   cd spring-tp1
2. **Open the project in Eclipse**:

- File → Import → Existing Maven Projects

3.**Run the test classes**:

- TestXML.java → shows XML-based configuration

- TestJava.java → shows @Component and @Value usage

- TestAutowired.java → shows dependency injection via @Autowired

🎯 Learning Objectives
✅ Understand XML-based configuration in Spring

✅ Use annotations like @Component, @Value, @Autowired

✅ Explore Spring's IoC container and bean lifecycle

✅ Practice modular and clean configuration approaches

