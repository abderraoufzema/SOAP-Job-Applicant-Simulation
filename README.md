# ✅ Job Application SOAP Web Service (Complete Solution)

This is a full Java SOAP project with server + client using Maven. Designed to run smoothly on Java 17+ and Java 20+.

---

## 📦 Folder Structure

```
JobApplicationSOAP_CompleteSolution/
├── README.md
├── pom.xml
└── src/
    └── main/
        └── java/
            ├── com/example/job/
            │   ├── JobApplicationService.java
            │   ├── JobApplicationServiceImpl.java
            │   └── JobApplicationPublisher.java
            └── com/example/client/
                └── JobApplicationClient.java
```

---

## ✅ Requirements

- Java JDK 17 or 20+
- Apache Maven
- Internet (to download dependencies)

---

## 🚀 Run the Server

```bash
mvn compile
mvn exec:java
```

Check WSDL:  
http://localhost:8080/jobapp?wsdl

---

## 🧪 Generate Client

In a second terminal:

```bash
wsimport -keep -p com.example.job http://localhost:8080/jobapp?wsdl
```

Paste the generated `.java` files into:
```
src/main/java/com/example/job/
```

---

## ▶️ Run the Client

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.example.client.JobApplicationClient"
```

---

## 🌐 Ready to Push to GitHub

1. Extract this folder.
2. Open terminal inside the folder.
3. Initialize Git:
   ```bash
   git init
   git add .
   git commit -m "Initial complete SOAP project"
   git branch -M main
   git remote add origin https://github.com/YOUR_USERNAME/YOUR_REPO.git
   git push -u origin main
   ```
