# Simple Library Management System (CLI)

This is a simple, console-based (CLI) application for managing a personal book collection. It's built entirely in core Java and demonstrates core Object-Oriented Programming (OOP) principles, clean file I/O operations, and data persistence by saving to local text files.

This project was a major exercise in **refactoring**—transforming a basic assignment into a robust, professional, and maintanable piece of code.

---

### ✨ Features

* **Add Books:** Add new books with a title, author, publication year, and ID.
* **Delete Books:** Remove a book from the collection by its title.
* **List All Books:** View all books currently in the library.
* **Persistent Storage:** All book data is saved to `books.txt` (if it exists) and automatically reloaded when the application starts.
* **Activity Logging:** All major actions (add, delete, errors) are automatically saved with a timestamp to `log.txt`.

---

### 🛠️ Technologies & Concepts

* **Java (Core)**
* **Object-Oriented Programming (OOP):** Clear separation of concerns using:
    * `Main`: Handles user interface (CLI).
    * `Book`: An **immutable** model class (using `final`) to securely hold data.
    * `Library`: Manages all business logic (adding, deleting, saving).
    * `Logger`: A `static` utility class for logging.
* **Java File I/O:** `BufferedWriter` and `BufferedReader` for robust file reading and writing.
* **Error Handling:** Use of `try-catch` blocks for `IOException` and `System.err` for logging errors.

---

### 🚀 How to Run

1.  **Prerequisites:** You must have Java Development Kit (JDK) installed on your system.
2.  **Clone the repository:**
    ```bash
    git clone [https://github.com/muhammedulusoy18/Java-Library-CLI.git](https://github.com/muhammedulusoy18/Java-Library-CLI.git)
    ```
3.  **Navigate to the project directory:**
    ```bash
    cd Java-Library-CLI
    ```
4.  **Compile all .java files (from the root directory):**
    ```bash
    javac src/*.java
    ```
5.  **Run the application (from the root directory):**
    ```bash
    java -cp src Main
    ```

---

### 💡 Key Learnings

* **Refactoring:** Migrating an entire codebase from Turkish to English (including variables, methods, and UI text) to meet global professional standards.
* **Immutability:** Understanding and implementing `final` to create immutable model classes (`Book.java`), making the data safer.
* **Static vs. Instance Methods:** Implementing the `Logger` as a `static` utility, while the `Library` operates as a stateful *instance*.
* **Safe File I/O:** Correctly implementing `FileWriter` (using "overwrite" mode, not "append" mode) to prevent data duplication and corruption.
* **Standard I/O Streams:** Using `System.err` for error messages and `System.out` for standard program output.
