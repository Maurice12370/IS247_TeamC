public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Generate Report");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    admin.addStudent();
                    break;
                case 2:
                    admin.updateStudent();
                    break;
                case 3:
                    admin.deleteStudent();
                    break;
                case 4:
                    admin.searchStudent();
                    break;
                case 5:
                    admin.generateReport();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
