package June_3_Task_overiding;
/*Task 3: Employee Role Info
Title: Show employee roles with overridden methods
Description:
Create a class Employee with method role() printing “General Employee”.
Create child classes Manager, Clerk, Tester, each overriding role() to print their specific roles.
Call role() on each object to show how overriding helps in specialization.*/
class Employee{
    void role(){
        System.out.println("General Employee");
    }
}
class Manager extends Employee {
    void role() {
        System.out.println("General Manager");
    }
}

    class Clerk extends Manager {
        void role() {
            System.out.println("General clerk");
        }
    }

    class Tester extends Clerk {
        void role() {
            System.out.println("General Tester");
        }
    }




public class Task_3 {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.role();

        Manager ma = new Manager();
        ma.role();

        Tester te = new Tester();
        te.role();

        Clerk cl = new Clerk();
        cl.role();
    }
}
