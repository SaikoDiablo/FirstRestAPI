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

Images how it should work:

<img width="1920" height="1020" alt="Screenshot 2026-01-06 122829" src="https://github.com/user-attachments/assets/858cd37f-57d1-4129-8f6d-cc5c0bcf3299" />
<img width="1920" height="1020" alt="Screenshot 2026-01-06 123429" src="https://github.com/user-attachments/assets/3074a85d-004f-4aa6-bc63-77034dcbc21f" />
<img width="1920" height="1020" alt="Swagger" src="https://github.com/user-attachments/assets/48f9e236-60d4-4eb5-942f-93aca2b06c57" />

<img width="1920" height="1020" alt="GET" src="https://<img width="1920" height="1020" alt="db" src="https://github.com/user-attachments/assets/6e1c2481-7f99-4332-bc46-7c7720623f09" />
github.com/user-attachments/assets/ec611a41-249f-41ca-a59d-73d1ec22d7d4" />

<img width="1920" height="1020" alt="Post" src="https://github.com/user-attachments/assets/c9c0f2fc-a598-4c79-925d-371204556465" />

Answer :
This works because of Spring Data JPA. Even though ProductRepository looks empty,
it actually extends JpaRepository, which already has methods like save() and findAll().
When the app starts, Spring automatically creates the implementation for this repository.
Because of that, ProductService can just use these methods without us writing them ourselves.
Basically, Spring handles all the basic database operations, which makes development easier and faster.


