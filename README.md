# 📘 Address Book App - Spring Boot

## 🔹 Project Description

This project is a **Spring Boot REST API** for managing an Address Book.
It demonstrates layered architecture using **Controller, DTO, Model, and Service layers** with in-memory storage.

---

## 🚀 Features

* Create Address
* Get All Addresses
* Get Address by ID
* Update Address
* Delete Address

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot
* Maven
* REST API
* PowerShell (Invoke-RestMethod for testing)

---

## 📂 Project Structure

```
src/main/java/com/example/addressbook
│
├── controller
│   └── AddressBookController.java
│
├── dto
│   └── AddressBookDTO.java
│
├── model
│   └── AddressBook.java
│
├── service
│   └── AddressBookService.java
│
└── AddressbookApplication.java
```

---

## ⚙️ How to Run

```bash
./mvnw spring-boot:run
```

Open:

```
http://localhost:8080
```

---

## 🔗 API Endpoints

### 🔹 Create

```
POST /addressbook/create
```

### 🔹 Get All

```
GET /addressbook/get
```

### 🔹 Get By ID

```
GET /addressbook/get/{id}
```

### 🔹 Update

```
PUT /addressbook/update/{id}
```

### 🔹 Delete

```
DELETE /addressbook/delete/{id}
```

---

## 🧪 Testing Using PowerShell

### Create

```powershell
$body = @{
    name = "Barnam"
    city = "Chennai"
} | ConvertTo-Json

Invoke-RestMethod -Uri "http://localhost:8080/addressbook/create" `
-Method POST `
-Body $body `
-ContentType "application/json"
```

### Get All

```powershell
Invoke-RestMethod -Uri "http://localhost:8080/addressbook/get"
```

---

## 🌿 GitFlow Strategy

* Each UC implemented in separate feature branch
* Merged into develop branch
* Feature branches retained using `-k` flag

---

## ✅ Use Cases Implemented

| UC  | Description               |
| --- | ------------------------- |
| UC1 | Setup Spring Boot Project |
| UC2 | REST API using Controller |
| UC3 | DTO and Model Layer       |
| UC4 | Service Layer             |
| UC5 | In-Memory CRUD Operations |

---

## 📌 Notes

* Data is stored in memory using `List`
* No database used in this version
* JPA/MySQL will be added in future enhancements

---

## 👨‍💻 Author

**Barnam**
