import java.util.*;

class Employee {
    int eno;
    String ename;
    int esal;

    void read(Scanner sc) {
        System.out.print("Enter employee number: ");
        eno = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter employee name: ");
        ename = sc.nextLine();
        System.out.print("Enter employee salary: ");
        esal = sc.nextInt();
    }

    void display() {
        System.out.println("Employee No   : " + eno);
        System.out.println("Employee Name : " + ename);
        System.out.println("Employee Salary: " + esal);
        System.out.println("-------------------------");
    }

    boolean compare(int searchEno) {
        return eno == searchEno;
    }
}

class EmployeeMain_q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            System.out.println("\nEnter details of employee " + (i + 1));
            emp[i].read(sc);
        }

        System.out.println("\n--- Employee Details ---");
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }

        System.out.print("\nEnter employee number to search: ");
        int searchEno = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (emp[i].compare(searchEno)) {
                System.out.println("\nEmployee Found:");
                emp[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nEmployee not found.");
        }
    }
}
