# 🛒 Product REST API — Spring Boot Project (Task 2)

A fully functional **REST API** for managing `Product` resources, built with **Spring Boot**, **Spring Data JPA**, **H2 in-memory database**, **Swagger UI**, and robust exception handling.

---

## 📦 Technologies Used

| Technology         | Purpose |
|--------------------|---------|
| **Java 17+**       | Language |
| **Spring Boot 3.x**| Application framework |
| **Spring Web**     | REST controllers & HTTP handling |
| **Spring Data JPA**| Database abstraction & CRUD ops |
| **Hibernate**      | JPA implementation |
| **H2 Database**    | In-memory database for dev/testing |
| **Lombok**         | Reduce boilerplate (`@Data`, `@NoArgsConstructor`, etc.) |
| **Swagger UI (OpenAPI 3)** | Interactive API documentation & testing |
| **Maven**          | Build & dependency management |

---

## 🗂 Project Structure

src/main/java/com/example/product/
├── api/
│ └── ProductController.java # REST endpoints
├── domain/
│ └── Product.java # @Entity (JPA)
├── repository/
│ └── ProductRepository.java # extends JpaRepository<Product, Long>
├── service/
│ └── ProductService.java # Business logic
├── support/
│ ├── mapper/
│ │ └── ProductMapper.java # DTO ↔ Entity mapping
│ ├── exception/
│ │ ├── ProductNotFoundException.java # Custom exception
│ │ └── ProductExceptionSupplier.java # Supplier for exceptions
│ └── handler/
│ └── ProductExceptionHandler.java # @ControllerAdvice for global error handling
└── shared/api/response/
└── ErrorMessageResponse.java # Standard error response DTO
 💡 All packages follow Spring best practices (separation of concerns: controller → service → repository → domain).

---

## 🚀 Getting Started

### ✅ Prerequisites
- JDK 17 or newer  
- Maven  
- IDE (IntelliJ IDEA recommended)

### ⚙️ Run the Application
```bash
# Clone & navigate
git clone https://github.com/your-username/spring-tasks.git
cd spring-tasks/task2-rest-api

# Build & run
./mvnw spring-boot:run

You can find all images of how it should be working in the images file in my repository.


Answer :
This works because of Spring Data JPA. Even though ProductRepository looks empty,
it actually extends JpaRepository, which already has methods like save() and findAll().
When the app starts, Spring automatically creates the implementation for this repository.
Because of that, ProductService can just use these methods without us writing them ourselves.
Basically, Spring handles all the basic database operations, which makes development easier and faster.


