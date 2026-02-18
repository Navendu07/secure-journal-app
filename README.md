# 🔐 Secure Journal Management System

A production-ready Spring Boot REST API for secure journal management with JWT authentication, role-based authorization, MongoDB Atlas integration, email service support, and Swagger documentation.

🌍 **Live API Documentation:**  
https://secure-journal-app.onrender.com/swagger-ui/index.html

---

## 🚀 Features

- 🔑 JWT-based Authentication & Authorization
- 👤 Role-Based Access Control (Admin / User)
- 📓 Create, Update, Delete Journal Entries
- 🧑‍💼 Admin User Management APIs
- ☁️ MongoDB Atlas Cloud Database
- 📧 Email Notification Support
- 🧾 Swagger OpenAPI 3 Documentation
- 🐳 Dockerized Deployment
- 🌍 Live Deployment on Render

---

## 🛠 Tech Stack

- **Backend:** Spring Boot 3
- **Security:** Spring Security + JWT
- **Database:** MongoDB Atlas
- **Documentation:** Springdoc OpenAPI (Swagger)
- **Mail Service:** Spring Boot Starter Mail
- **Build Tool:** Maven
- **Containerization:** Docker
- **Hosting:** Render

---

## 📂 API Documentation

Swagger UI:  
https://secure-journal-app.onrender.com/swagger-ui/index.html

OpenAPI Spec:  
https://secure-journal-app.onrender.com/v3/api-docs

---

## 🔐 Authentication

This API uses Bearer JWT tokens.

Steps:
1. Login to get JWT token.
2. Click **Authorize** in Swagger.
3. Enter:

   ```
   Bearer <your_token>
   ```

---

## 🧑‍💼 Admin APIs

- `POST /admin/create-admin-user`
- `GET /admin/all-users`
- `GET /admin/clean-app-cache`

---

## 👤 User APIs

- Register User
- Login User
- Update User
- Delete User

---

## 📓 Journal APIs

- Create Journal Entry
- Update Journal Entry
- Delete Journal Entry
- Fetch All Journals
- Fetch Journal By ID

---

## ⚙️ Required Environment Variables

```
JWT_SECRET
MAIL_USERNAME
MAIL_PASSWORD
SPRING_DATA_MONGODB_URI
WEATHER_API_KEY
SPRING_PROFILES_ACTIVE
```

---

## 🐳 Docker Setup

Build Image:

```
docker build -t secure-journal-app .
```

Run Container:

```
docker run -p 8080:8080 secure-journal-app
```

---

## 💻 Local Development Setup

1. Clone Repository

```
git clone https://github.com/your-username/your-repository-name.git
```

2. Configure Environment Variables

3. Run Application

```
mvn spring-boot:run
```

---

## 🏗 Architecture

- Layered Architecture (Controller → Service → Repository)
- Secure JWT Authentication
- Environment-based Configuration
- MongoDB Cloud Integration
- Clean RESTful API Design

---

## 👨‍💻 Author

Navendu Ojha  
Backend Developer | Java | Spring Boot | MongoDB
