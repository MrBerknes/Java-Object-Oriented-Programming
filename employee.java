import java.util.Scanner;
public class employee {
    //Atributes
    String name;
    int SocialSecurityNumber;
    float Salary;
    int WorkingHour;

    void displayinfo() {
        System.out.println("employee name" + name);
        System.out.println("social security number" + SocialSecurityNumber);
    }

    void displaySalary() {
        float Salary = this.Salary * WorkingHour;
        System.out.println("salary" + Salary);
    }

    public static void main(String[] args) {
        employee emp1 = new employee();
        emp1.name = "Ahmet Yılmaz";
        emp1.SocialSecurityNumber = 123456789;
        emp1.Salary = 30;
        emp1.WorkingHour = 160;

        emp1.displayinfo();
        emp1.displaySalary();
        Scanner input = new Scanner(System.in);

        employee emp2 = new employee();
        System.out.println("name: ");
        emp2.name = input.nextLine();
        System.out.println("Social security number: ");
        emp2.SocialSecurityNumber = input.nextInt();
        System.out.println("salary: ");
        emp2.Salary = input.nextFloat();
        System.out.println("working hour: ");
        emp2.WorkingHour = input.nextInt();

        emp2.displayinfo();
        emp2.displaySalary();

    }
}
