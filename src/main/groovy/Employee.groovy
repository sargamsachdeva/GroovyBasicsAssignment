
class Employee extends Person {

    int empId;
    String company;
    float salary;

    static void main(String[] args) {

        Employee employee = new Employee();

        employee.name = "Priya";
        employee.@age = 21;
        employee.gender = Gender.F;
        employee.address = "Mumbai";

        employee.empId = 2603;
        employee.company = "To The New";
        employee.salary = 50000;

        println("${employee.name} ${employee.@age} ${employee.gender} ${employee.address} ${employee.empId} ${employee.company} ${employee.salary}");

        employee.toString()
    }

    //Ques4
    @Override
    String toString() {

        println("$name is a girl aged $age who lives at $address. She works for $company with employee id $empId and draws $salary lots of money !!!!.")
    }

}
