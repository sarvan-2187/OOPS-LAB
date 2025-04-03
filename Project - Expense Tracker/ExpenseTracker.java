import java.sql.*;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class ExpenseTracker {
    private static final String DB_URL = "jdbc:sqlite:expenses.db";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL); Statement stmt = conn.createStatement()) {
            String createTableQuery = "CREATE TABLE IF NOT EXISTS expenses (id INTEGER PRIMARY KEY AUTOINCREMENT, date TEXT, amount REAL, category TEXT, description TEXT)";
            stmt.execute(createTableQuery);
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nExpense Tracker");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Show Summary");
            System.out.println("4. Save Report to CSV");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addExpense(scanner);
                case 2 -> viewExpenses();
                case 3 -> showSummary();
                case 4 -> saveReportToCSV();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }

    private static void addExpense(Scanner scanner) {
        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Enter category (Food, Transport, etc.): ");
        String category = scanner.nextLine();
        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        try (Connection conn = DriverManager.getConnection(DB_URL); PreparedStatement pstmt = conn.prepareStatement("INSERT INTO expenses (date, amount, category, description) VALUES (?, ?, ?, ?)");) {
            pstmt.setString(1, date);
            pstmt.setDouble(2, amount);
            pstmt.setString(3, category);
            pstmt.setString(4, description);
            pstmt.executeUpdate();
            System.out.println("Expense added successfully!");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    private static void viewExpenses() {
        try (Connection conn = DriverManager.getConnection(DB_URL); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT * FROM expenses")) {
            System.out.println("\nExpenses:");
            while (rs.next()) {
                System.out.printf("%d | %s | %.2f | %s | %s\n", rs.getInt("id"), rs.getString("date"), rs.getDouble("amount"), rs.getString("category"), rs.getString("description"));
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    private static void showSummary() {
        try (Connection conn = DriverManager.getConnection(DB_URL); Statement stmt = conn.createStatement()) {
            ResultSet totalRs = stmt.executeQuery("SELECT SUM(amount) AS total FROM expenses");
            if (totalRs.next()) {
                System.out.printf("\nTotal Expenses: %.2f\n", totalRs.getDouble("total"));
            }

            ResultSet categoryRs = stmt.executeQuery("SELECT category, SUM(amount) AS total FROM expenses GROUP BY category");
            System.out.println("\nCategory-wise Summary:");
            while (categoryRs.next()) {
                System.out.printf("%s: %.2f\n", categoryRs.getString("category"), categoryRs.getDouble("total"));
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    private static void saveReportToCSV() {
        String fileName = "expense_report.csv";
        try (Connection conn = DriverManager.getConnection(DB_URL); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT * FROM expenses"); FileWriter writer = new FileWriter(fileName)) {
            writer.append("ID,Date,Amount,Category,Description\n");
            while (rs.next()) {
                writer.append(rs.getInt("id") + "," + rs.getString("date") + "," + rs.getDouble("amount") + "," + rs.getString("category") + "," + rs.getString("description") + "\n");
            }
            System.out.println("Report saved to " + fileName);
        } catch (SQLException | IOException e) {
            System.out.println("Error saving report: " + e.getMessage());
        }
    }
}
