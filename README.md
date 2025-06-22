# 🧑‍💼 Employee Hibernate CRUD Application

This is a **Java-based CRUD application** for managing employee records using **Hibernate ORM**, **JDBC**, and **MySQL**. The application demonstrates how to build a basic back-end system using Hibernate for ORM, Maven for dependency management, and MySQL for data persistence.

---

## 📌 Key Features

- Add new employee details
- View all employee records
- Update employee information
- Delete employee entries
- Hibernate ORM configuration with MySQL
- Command-line interaction through Java

---

## 🛠️ Technologies Used

| Technology | Description                      |
|------------|----------------------------------|
| Java       | Core programming language        |
| Hibernate  | ORM tool for database interaction |
| MySQL      | Relational database              |
| JDBC       | For basic DB connectivity        |
| Maven      | Project and dependency manager   |
| Eclipse    | IDE used for development         |



---




## 🧑‍🎓 Prerequisites

Before running this project, make sure you have the following installed:

- ✅ Java JDK (17 or later)
- ✅ MySQL Server
- ✅ Apache Maven
- ✅ Eclipse IDE or IntelliJ IDEA
- ✅ Git (optional, for cloning repo)

---

## 🚀 Getting Started (Step-by-Step for Beginners)

### 🔹 Step 1: Clone the Repository

Open terminal or Git Bash and run:

git clone https://github.com/Dhanalekshmi26/Hibernate.git
cd Hibernate
Or simply download the ZIP file from GitHub and extract it.

🔹 Step 2: Import the Project into Eclipse
Open Eclipse.

Go to: File > Import > Existing Maven Projects.

Select the folder: EmployeeHibernateApp.

Finish the import. Maven will automatically resolve dependencies from pom.xml.

🔹 Step 3: Setup MySQL Database
Open MySQL Workbench or Command Line.

Create a new database:
CREATE DATABASE employee_db;
USE employee_db;

🔹 Step 4: Configure Hibernate
Open hibernate.cfg.xml and update these properties to match your MySQL setup:
<property name="connection.url">jdbc:mysql://localhost:3306/employee_db</property>
<property name="connection.username">root</property>
<property name="connection.password">your_password</property>
Ensure MySQL is running and the DB name, username, and password are correct.

🔹 Step 5: Build the Project (Maven)
In Eclipse:
Right-click the project > Run As > Maven clean
Then: Run As > Maven install

🔹 Step 6: Run the Application
Find and run the main class — usually named something like:
EmployeeMain.java

You can test all CRUD operations through the console (like adding, viewing, updating, and deleting employees).


📦 Maven Dependencies (from pom.xml)
<dependencies>
    <dependency>
        <groupId>org.hibernate</groupId>
        <artifactId>hibernate-core</artifactId>
        <version>5.6.15.Final</version>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.33</version>
    </dependency>
</dependencies>

## 🙌 Contributions

This is a personal learning repo, but if you’re also learning Java and want to suggest ideas, feel free to open an issue or PR!

---

**Made with 💻 by Dhanalekshmi Vipinkumar**  
🔗 [Visit My GitHub](https://github.com/Dhanalekshmi26)



