# 🚀 Optimized Job Search Engine using Java with DSA

An optimized console-based Job Search Engine built using **Core Java and Data Structures & Algorithms** to perform fast, intelligent, and ranked job retrieval based on keyword search.

This project demonstrates real-world search engine logic including indexing, ranking, and optimized lookup performance.

---

## 📌 Project Objective

To design and implement a smart job search system that improves search efficiency using DSA concepts instead of traditional linear search methods.

---

## 🧠 Key Features

- 🔍 Keyword-based job search
- ⚡ Optimized retrieval using HashMap indexing
- 🏆 Ranking system using Priority Queue
- 🧮 Frequency-based scoring algorithm
- 📂 File-based job data storage
- 🧹 Stop-word filtering ready structure
- 📊 Improved search efficiency

---

## 🛠️ Technologies Used

### Programming Language
- Java (Core Java)

### Collections Framework
- HashMap
- ArrayList
- PriorityQueue
- List Interface

### DSA Concepts Applied
- Searching Algorithms
- Ranking Algorithms
- Indexing (Inverted logic)
- Heap Data Structure
- Time Complexity Optimization

### Other Concepts
- File Handling
- OOP Principles
- Exception Handling

---

## 🏗️ Project Structure

src/com/jobsearch/

│── Job.java
│── JobService.java
│── SearchEngine.java
│── FileManager.java
│── Main.java

jobs.txt
README.md


---

## ⚙️ System Workflow

1. Job data stored in `jobs.txt`
2. FileManager loads jobs
3. JobService manages storage
4. Data indexed using HashMap
5. User enters keyword
6. Matching jobs filtered
7. Ranking calculated
8. Results sorted using Priority Queue
9. Top matches displayed

---

## 🧮 Ranking Logic

Score calculated based on:

| Match Type | Score |
|------------|-------|
| Title Match | +5 |
| Company Match | +3 |
| Skill Match | +2 |

Higher score → Higher rank.

---

## 📈 Optimization Achieved

| Operation | Traditional | Optimized |
|-----------|-------------|-----------|
| Search    | O(n)        | O(1) lookup |
| Ranking   | O(n log n) manual | Heap optimized |
| Filtering | Linear scan | Indexed |

---

## ▶️ How to Run Project

1. Open Eclipse
2. Import Project
3. Ensure `jobs.txt` is in root folder
4. Run `Main.java`
5. Use menu options:

Add Job
View Jobs
Search Job
Delete Job
Exit


---

## 📂 Sample jobs.txt Format

101,Java Developer,TCS,Java Spring SQL,Bangalore,600000
102,Backend Engineer,Infosys,Java Microservices AWS,Hyderabad,800000
103,Software Engineer,Wipro,Java React MySQL,Chennai,700000

---

## 📸 Sample Output

Top Matches:

Job ID: 101
Title: Java Developer
Company: TCS
Skills: Java, Spring, SQL
Location: Bangalore
Salary: 6 LPA

---

## 🔮 Future Enhancements

- JDBC + MySQL integration
- Web UI (Spring Boot)
- REST API search
- Multithreaded indexing
- Auto search suggestions
- Resume matching system

---

## 💡 Project Highlights

- Combines Core Java + DSA
- Real-world search engine logic
- Ranking & scoring algorithm
- Resume-ready optimization project
- Easily scalable to full stack

---

## 👨‍💻 Author

**Veerapathiran E**  
GitHub: https://github.com/VeerapathiranE/

---

## ⭐ If you like this project

Give a ⭐ on GitHub and support!

