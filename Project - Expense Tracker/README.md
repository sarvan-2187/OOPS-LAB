# Expense Tracker (Java + SQLite)

## Overview
This is a **console-based Expense Tracker** built using **Java** and **SQLite**. It allows users to:
- Add expenses (date, amount, category, description)
- View all recorded expenses
- Generate a total and category-wise summary
- Save expense reports as a CSV file

## Features
✔ Add new expenses with details like date, amount, category, and description  
✔ View all recorded expenses in a structured format  
✔ Generate expense summaries (total and category-wise)  
✔ Save expense data into a CSV file for further analysis  
✔ Persistent storage using SQLite database  

## Technologies Used
- Java (JDK 8+)
- SQLite (JDBC for database interaction)
- File handling (CSV export)

## Installation & Setup
### Prerequisites
1. Install Java Development Kit (JDK 8 or later).
2. Download the SQLite JDBC driver from: [SQLite JDBC Driver](https://github.com/xerial/sqlite-jdbc).
3. Place the downloaded `sqlite-jdbc.jar` file in your project directory.

### Running the Project
1. Clone or download this repository.
2. Compile the program:
   ```sh
   javac -cp ".;sqlite-jdbc.jar" ExpenseTracker.java
   ```
3. Run the program:
   ```sh
   java -cp ".;sqlite-jdbc.jar" ExpenseTracker
   ```

## Usage Guide
1. When the program runs, it provides a menu with options:
   - **1**: Add a new expense
   - **2**: View all expenses
   - **3**: Show expense summary
   - **4**: Save expenses to a CSV file
   - **5**: Exit the application
2. Follow the prompts to enter your expense details.
3. View summaries and save reports as needed.

## File Output
- Expenses are stored in **expenses.db** (SQLite database).
- The CSV report is saved as **expense_report.csv**.

## Future Enhancements
- Add filtering options (date range, category-based filtering, etc.)
- Implement graphical UI for better user experience
- Support for multiple users with login authentication

## License
This project is open-source and available under the **MIT License**.

## Author
Developed by **Sarvan Kumar**

