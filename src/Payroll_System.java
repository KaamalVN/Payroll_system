class Employee{
    void calculatePay(String name,double salary) {
        System.out.println(name + " " + salary * 12);
    }
    void calculatePay(String name,double hourlyRate,double hoursWorked){
        System.out.println(name+" "+hoursWorked*hoursWorked);
    }
}

public class Payroll_System{
    public static void main(String[] args) {
        Employee employee=new Employee();

        employee.calculatePay("Kaamal",20000.0);
        employee.calculatePay("Abhindra",1000.0,24.0);

    }
}