public class DisplayEmployee {
    public static void main(String[] args) {
        // creating three Employee objects like name , id , job, role
        Employee displayEmployee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee displayEmployee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee displayEmployee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        // Displaying employee information
        displayEmployeeInfo(displayEmployee1);
        displayEmployeeInfo(displayEmployee2);
        displayEmployeeInfo(displayEmployee3);
    }


    private static void displayEmployeeInfo(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("ID Number: " + employee.getIdNumber());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Position: " + employee.getPosition());
        System.out.println();
    }
}