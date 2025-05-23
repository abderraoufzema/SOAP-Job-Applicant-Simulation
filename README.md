# 🧾 SOAP Job Applicant Simulation

A complete **Java SOAP Web Service** project using **JAX-WS with Maven** (Jakarta XML Web Services), simulating a job application submission system. Built for mastering SOAP architecture, Web Services, and WSDL-based communication in Java.

---

## 🚀 Technologies Used

- 🔧 Java 17+ / 20 compatible
- 📦 Maven (build and dependency management)
- 🔗 JAX-WS (via `jakarta.xml.ws`)
- 🧩 SOAP, WSDL, `wsimport`
- 🖥️ PowerShell / Git Bash / VS Code Terminal

---

## 📚 What This Project Does

- Publishes a SOAP web service on `http://localhost:8080/jobapp`
- Auto-generates WSDL
- Accepts job applicant data: name, email, and resume text
- Provides a SOAP client to consume the service
- Can be extended into real-world HR, CRM, or recruiting systems

---

## 📂 Project Structure

```
JobApplicationSOAP/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            ├── com/example/job/       ← Web service logic
            └── com/example/client/    ← SOAP client
```

---

## ⚙️ How to Run Locally

### 1️⃣ Start the Server
```bash
mvn compile
mvn exec:java
```
Visit in browser:
```
http://localhost:8080/jobapp?wsdl
```

### 2️⃣ Generate the Client Stubs
```bash
wsimport -keep -p com.example.job http://localhost:8080/jobapp?wsdl
```
Paste generated `.java` files into:
```
src/main/java/com/example/job/
```

### 3️⃣ Run the SOAP Client
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.example.client.JobApplicationClient"
```

---

## 💼 Real-World Use Case

This project simulates a basic HR system where applicants submit their data via a SOAP interface. The architecture mirrors legacy systems in many enterprise environments (e.g., banking, healthcare, insurance) where SOAP is still in use.

---

## 📈 Highlights

- 💼 Aligned with enterprise SOAP APIs
- 👨‍💻 Hands-on WSDL client generation
- 📖 Strong portfolio project for Java backend roles
- ✅ GitHub-ready and cleanly structured

---

## 👨‍💻 Author

**Abderraouf Zema**  
🔗 [GitHub Profile](https://github.com/abderraoufzema)  
💬 *Passionate about backend systems, integration, and scalable services.*

---

## ⭐ Want to Support or Collaborate?

- Leave a ⭐ on this repo if you find it useful
- Fork it to explore SOAP with databases or REST comparisons
- Message me on GitHub or LinkedIn for collab or internship references
