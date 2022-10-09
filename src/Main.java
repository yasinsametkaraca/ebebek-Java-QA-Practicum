public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Yasin Samet Karaca",9500,20,1998);
        System.out.println(employee.bonus());
        System.out.println(employee.tax());
        System.out.println(employee.raiseSalary());
        System.out.println(employee.toString());
    }
}