public class Assignment1{
    public static void main(String[] args) {
        String empName = "A";
        double salary = 800000.0;
        if(salary<800000.0) {
           double finalSalary = salary + (salary* 0.10);
            System.out.println(empName + "'s actual salary is: "+ salary);
            System.out.println(empName + "'s salary is: "+ finalSalary + "(included bonus 10%)");
            System.out.println("Salary is LOW.");
            
        }
        else if(salary>800000.0){
             System.out.println(empName + "'s actual salary is: "+ salary);
            System.out.println(empName + "'s salary is: " + salary);
            System.out.println("Salary is HIGH.");
            
        }
        else {
             System.out.println(empName + "'s actual salary is: "+ salary);
            System.out.println("Salary is Standard.");
            
        }
     }
}

