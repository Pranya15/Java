class Employees {
    String name;
    int id;
    double salary;

    Employees(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }

    void incrementSalary() {
        salary = salary + (salary * 0.05);   // 5% increment
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------------");
    }
}

class e {
    public static void main(String[] args) {

        Employees e1 = new Employees("Aarav", 101, 30000);
        Employees e2 = new Employees("Riya", 102, 45000);

        System.out.println("Before Increment:");
        e1.show();
        e2.show();

        e1.incrementSalary();
        e2.incrementSalary();

        System.out.println("After 5% Increment:");
        e1.show();
        e2.show();
    }
}
