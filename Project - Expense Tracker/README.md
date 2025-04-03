# Expense Tracker (Java + SQLite)<br>
## Overview<br>
This is a console-based Expense Tracker built using Java and SQLite. It allows users to:<br>

Add expenses (date, amount, category, description)<br>
View all recorded expenses<br>
Generate a total and category-wise summary<br>
Save expense reports as a CSV file<br>
 ## Features<br>
✔ Add new expenses with details like date, amount, category, and description<br>
✔ View all recorded expenses in a structured format<br>
✔ Generate expense summaries (total and category-wise)<br>
✔ Save expense data into a CSV file for further analysis<br>
✔ Persistent storage using SQLite database<br>

## Technologies Used
Java (JDK 8+)<br>
SQLite (JDBC for database interaction)<br>
File handling (CSV export)<br><br>
## Installation & Setup<br>
Prerequisites<br>
Install Java Development Kit (JDK 8 or later).<br>
Download the SQLite JDBC driver from: SQLite JDBC Driver.<br>
Place the downloaded sqlite-jdbc.jar file in your project directory.<br>
## Running the Project<br>
Clone or download this repository.<br>
Compile the program:<br>
javac -cp ".;sqlite-jdbc.jar" ExpenseTracker.java<br>
## Run the program:<br>
java -cp ".;sqlite-jdbc.jar" ExpenseTracker<br>
## Usage Guide<br>
When the program runs, it provides a menu with options:<br>
1: Add a new expense<br>
2: View all expenses<br>
3: Show expense summary<br>
4: Save expenses to a CSV file<br>
5: Exit the application<br>
Follow the prompts to enter your expense details.<br>
View summaries and save reports as needed.<br>
## File Output<br>
Expenses are stored in expenses.db (SQLite database).<br>
The CSV report is saved as expense_report.csv.<br>
Future Enhancements<br>
Add filtering options (date range, category-based filtering, etc.)<br>
Implement graphical UI for better user experience<br>
Support for multiple users with login authentication<br>
## License<br>
This project is open-source and available under the MIT License.<br>
## Author<br>
Developed by Sarvan Kumar<br>
